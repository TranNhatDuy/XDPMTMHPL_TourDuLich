
package BLL;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;


public class NhanVienBLL {
    public static ArrayList<NhanVienDTO> loadDataNhanVien() {
        NhanVienDAO pt = new NhanVienDAO();
        return pt.loadDataNhanVien();
    }      
    public static void addNhanVien(NhanVienDTO pt) {
        NhanVienDAO.addNhanVien(pt);
    }      
    public static void editNhanVien(NhanVienDTO pt,String data) {          
        NhanVienDAO.editNhanVien(pt, data);
    }
    public static void removeNhanVien(String mapt) {
        NhanVienDAO.removeNhanVien(mapt);
    } 
   
}
