
package BLL;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;


public class NhanVienBLL {
    public static ArrayList<NhanVienDTO> loadDataNhanVien() {
        NhanVienDAO nv = new NhanVienDAO();
        return nv.loadDataNhanVien();
    }      
    public static void addNhanVien(NhanVienDTO nv) {
        NhanVienDAO.addNhanVien(nv);
    }      
    public static void editNhanVien(NhanVienDTO nv,String data) {          
        NhanVienDAO.editNhanVien(nv, data);
    }
    public static void removeNhanVien(String manv) {
        NhanVienDAO.removeNhanVien(manv);
    } 
   
}
