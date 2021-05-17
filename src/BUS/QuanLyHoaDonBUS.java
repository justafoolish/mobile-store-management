package BUS;

import DAO.QuanLyHoaDonDAO;
import DTO.HoaDon;
import DTO.KhachHang;

import java.util.ArrayList;

public class QuanLyHoaDonBUS {
    private static ArrayList<HoaDon> dshd = new ArrayList<>();
    private QuanLyHoaDonDAO qlhdDAO = new QuanLyHoaDonDAO();

    public QuanLyHoaDonBUS() {
        if(dshd.isEmpty()) {
            dshd = qlhdDAO.readDB();
        }
    }
    public ArrayList<HoaDon> getDshd() {
        return this.dshd;
    }

    public void setDshd() {
        if(dshd.isEmpty()) {
            dshd = qlhdDAO.readDB();
        }
    }

    public String[] getHeader() {
        return new String[] {"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Mã giảm giá", "Ngày Lập", "Tổng tiền", "Tổng chiết khấu"};
    }

    public HoaDon getHoaDon(String mahd) {
        for(HoaDon hd: dshd) {
            if(hd.getMaHoaDon().equals(mahd))
                return hd;
        }
        return null;
    }

    public Boolean themHD(HoaDon hd) {
        Boolean check = qlhdDAO.add(hd);

        if(check) {
            dshd.add(hd);
            return true;
        }
        return false;
    }

    public Boolean updateHD(HoaDon hd) {
        Boolean check = qlhdDAO.update(hd);
        if(check) {
            dshd.forEach((hd1) -> {
                if(hd1.getMaHoaDon().equals(hd.getMaHoaDon()));
                    hd1 = hd;
            });
            return true;
        }
        return false;
    }

    public Boolean xoaHD(String maHD) {
        Boolean check = qlhdDAO.delete(maHD);
        if(check) {
            for (int i = (dshd.size() - 1); i >= 0; i--) {
                if (dshd.get(i).getMaHoaDon().equals(maHD)) {
                    dshd.remove(i);
                    return true;
                }
            }
            return true;

        }
        return false;
    }
    public String setMaHD() {
        int max = 0;
        for (HoaDon hd : dshd) {
            String latestID = hd.getMaHoaDon();
            int n = Integer.parseInt(latestID.substring(2));
            if (max < n) {
                max = n;
            }
        }

        return "HD" + String.valueOf(++max);
    }

    public Boolean updateTongTien(String maHD, int tongTien) {
        for(HoaDon hd : dshd) {
            if(hd.getMaHoaDon().equals(maHD)) {
                int curTotal = hd.getTongTien();
                Boolean check = qlhdDAO.updateTongTien(maHD,curTotal+tongTien);
                if(check) {
                    hd.setTongTien(curTotal+tongTien);
                    return true;
                }

            }
        }
        return false;
    }
}
