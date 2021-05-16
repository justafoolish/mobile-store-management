package BUS;

import DAO.ThongKeDAO;
import DTO.ThongKeKhachHang;
import DTO.ThongKeSanPham;

import java.util.ArrayList;

public class ThongKeBUS {
    private ThongKeDAO tkDAO = new ThongKeDAO();

    public ArrayList<ThongKeSanPham> getThongKeSP() {
        return tkDAO.getThongKe();
    }

    public ArrayList<ThongKeKhachHang> getThongKeKH() {
        return tkDAO.thongKeKH();
    }
    public String[] headerThongKeSP() {
        return new String[] {"Mã sản phẩm", "Tên sản phẩm", "Số lượng bán được", "Tổng tiền"};
    }
    public String[] headerThongKeKH() {
        return new String[] {"STT","Tên khách hàng", "Số sản phẩm mua", "Ngày mua", "Tổng tiền"};
    }

}
