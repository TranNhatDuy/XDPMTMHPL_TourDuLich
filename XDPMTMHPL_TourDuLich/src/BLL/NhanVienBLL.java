
package BLL;

import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class NhanVienBLL {
    public static ArrayList<NhanVienDTO> loadDataNhanVien() {
        NhanVienBLL pt = new NhanVienBLL();
        return pt.loadDataNhanVien();
    }      
    public static void addNhanVien(NhanVienDTO pt) {
        NhanVienBLL.addNhanVien(pt);
    }      
    public static void editNhanVien(NhanVienDTO pt,String data) {          
        NhanVienBLL.editNhanVien(pt, data);
    }
    public static void removeNhanVien(String mapt) {
         NhanVienBLL.removeNhanVien(mapt);
    } 
   
}
