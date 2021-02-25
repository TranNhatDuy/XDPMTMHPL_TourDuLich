
package DAO;

import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class NhanVienDAO {
    public static ArrayList<NhanVienDTO> loadDataNhanVien() {
        NhanVienDAOImp pt = new NhanVienDAOImp();
        return pt.loadDataNhanVien();
    }      
    public static void addNhanVien(NhanVienDTO pt) {
        NhanVienDAOImp.addNhanVien(pt);
    }      
    public static void editNhanVien(NhanVienDTO pt,String data) {          
        NhanVienDAOImp.editNhanVien(pt, data);
    }
    public static void removeNhanVien(String mapt) {
         NhanVienDAOImp.removeNhanVien(mapt);
    } 
   
}
