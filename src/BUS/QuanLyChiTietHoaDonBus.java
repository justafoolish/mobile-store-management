package BUS;

import DAO.QuanLyChiTietHoaDonDAO;
import DAO.QuanLySanPhamDAO;
import DTO.ChiTietHoaDon;
import DTO.ThongKeSanPham;

import java.sql.SQLException;
import java.util.ArrayList;

public class QuanLyChiTietHoaDonBus {
    private static ArrayList<ChiTietHoaDon> dscthd = new ArrayList<>();
    private QuanLyChiTietHoaDonDAO qlcthdDAO = new QuanLyChiTietHoaDonDAO();
    private QuanLyHoaDonBUS qlhdBUS = new QuanLyHoaDonBUS();
    private QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();

    public QuanLyChiTietHoaDonBus() {
        if(dscthd.isEmpty()) {
            dscthd = qlcthdDAO.readDB();
        }
    }

    public void setDscthd() {
        if(dscthd.isEmpty()) {
            dscthd = qlcthdDAO.readDB();
        }
    }
    public String[] getHeader() {
        return new String[]{"Mã hóa đơn", "Mã sản phẩm", "Số lượng","Thành tiền","Chiết khấu"};
    }
    public String[] getHeadersThongKe() {
        return new String[] {"Mã sản phẩm", "Tên sản phẩm", "Số lượng bán được", "Tổng tiền"};
    }

    public ArrayList<ChiTietHoaDon> getCTbyID(String mahd) {
        ArrayList<ChiTietHoaDon> result = new ArrayList<>();
        dscthd.forEach((cthd) -> {
            if(cthd.getMaHoaDon().equals(mahd)) {
                result.add(cthd);
            }
        });
        return result;
    }
    public Boolean updateQty(String mahd, String maSP, int Soluong) throws SQLException {
        int check = qlcthdDAO.updateQty(mahd,maSP,Soluong);
        if(check != 0) {
            dscthd.forEach((cthd) -> {
                if(cthd.getMaHoaDon().equals(mahd) && cthd.getMaSanPham().equals(maSP)) {
                    cthd.setSoLuong(Soluong);
                    cthd.setThanhTien(Soluong*check);
                }
            });
            return true;
        }
        return false;
    }
    public ArrayList<ThongKeSanPham> getThongKe() {
        return qlcthdDAO.getThongKe();
    }
}
