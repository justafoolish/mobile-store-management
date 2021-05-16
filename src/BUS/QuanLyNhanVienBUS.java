/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.QuanLyNhanVienDAO;
import DTO.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanVienBUS {
    private static ArrayList<NhanVien> dsnv = new ArrayList<>();
    private QuanLyNhanVienDAO qlnvDAO = new QuanLyNhanVienDAO();

    public QuanLyNhanVienBUS() {
        if(dsnv.isEmpty()) {
            dsnv = qlnvDAO.readDB();
        }
    }
    public String[] getHeaders() {
        return new String[]{"Mã Nhân Viên", "Họ Nhân Viên", "Tên Nhân Viên",
        "Giới Tính", "Email", "Địa Chỉ", "Chức Vụ", "SĐT", "Hình Ảnh", "Chú Thích"};
    }
    public void readDB() {
        if(dsnv.isEmpty()) {
            dsnv = qlnvDAO.readDB();
        }
    }
    
    public NhanVien getNhanVien(String manv) {
        for(NhanVien nv : dsnv) {
            if(nv.getMaNhanVien().equals(manv))
                return nv;
        }
        return null;
    }
    public ArrayList<NhanVien> timkiem(String manv, String tennv) {
        ArrayList<NhanVien> result = new ArrayList<>();

        return result;
    }

    public Boolean themNhanVien(NhanVien nv) {
        Boolean check = qlnvDAO.add(nv);

        if(check) {
            dsnv.add(nv);
        }
        return check;
    }
    
    public Boolean themNhanVien(String maNV, String hoNV, String tenNV, String gioiTinh, String email, String diaChi, String chucVu, String SDT, String hinhAnh, String chuThich){
        NhanVien nv = new NhanVien(hinhAnh, hoNV, tenNV, gioiTinh, email, diaChi, chucVu, SDT, hinhAnh, chuThich);
        return themNhanVien(nv);
    }

    public Boolean xoaNhanVien(String manv) {
        Boolean check = qlnvDAO.delete(manv);

        if(check) {
            for (int i = (dsnv.size() - 1); i >= 0; i--) {
                if (dsnv.get(i).getMaNhanVien().equals(manv)) {
                    dsnv.remove(i);
                }
            }
        }
        return check;
    }
    
    public Boolean updateNhanVien(String maNV, String hoNV, String tenNV, String gioiTinh, String email, String diaChi, String chucVu, String SDT, String hinhAnh, String chuThich) {
        Boolean check = qlnvDAO.update(maNV, hoNV, tenNV, gioiTinh, email, diaChi, chucVu, SDT, hinhAnh, chuThich);

        if(check) {
            dsnv.forEach((nv) -> {
                if(nv.getMaNhanVien().equals(maNV)) {
                    nv.setHo(hoNV);
                    nv.setTen(tenNV);
                    nv.setGioiTinh(gioiTinh);
                    nv.setEmail(email);
                    nv.setDiaChi(diaChi);
                    nv.setChucVu(chucVu);
                    nv.setSDT(SDT);
                    nv.setSDT(hinhAnh);
                    nv.setSDT(chuThich);
                }
            });
        }

        return  check;

    }
    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }
    public String setMaNhanVien() {
        int max=0;
        for(NhanVien nv : dsnv) {
            String  latestID = nv.getMaNhanVien();
            int n = Integer.parseInt(latestID.substring(2));
            if(max < n) {
                max = n;
            }
        }


         return "NV"+String.valueOf(++max);
    }
}
