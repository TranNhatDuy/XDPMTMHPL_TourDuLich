package BLL;

import DAO.NhanVienDAOImp;
import DTO.NhanVienDTO;
import java.util.ArrayList;

public class NhanVienBLL {

    private NhanVienDAOImp nhanvien = new NhanVienDAOImp();

    public ArrayList<NhanVienDTO> loadDataNhanVien() {
        return nhanvien.loadDataNhanVien();
    }

    public boolean addNhanVien(NhanVienDTO pt) {
        return nhanvien.addNhanVien(pt);
    }

    public boolean editNhanVien(NhanVienDTO pt, String data) {
        return nhanvien.editNhanVien(pt, data);
    }

    public boolean removeNhanVien(String data) {
        return nhanvien.removeNhanVien(data);
    }

}
