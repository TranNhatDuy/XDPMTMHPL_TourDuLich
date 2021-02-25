
package DAO;

import DTO.PhuongTienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class PhuongTienDAO {
    public static ArrayList<PhuongTienDTO> loadDataPhuongTien() {
        PhuongTienDAOImp pt = new PhuongTienDAOImp();
        return pt.loadDataPhuongTien();
    }      
    public static void addPhuongTien(PhuongTienDTO pt) {
        PhuongTienDAOImp.addPhuongTien(pt);
    }      
    public static void editPhuongTien(PhuongTienDTO pt,String data) {          
        PhuongTienDAOImp.editPhuongTien(pt, data);
    }
    public static void removePhuongTien(String mapt) {
         PhuongTienDAOImp.removePhuongTien(mapt);
    } 
    public static ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String mapt) {
        PhuongTienDAOImp pt = new PhuongTienDAOImp();
        return pt.searchPhuongTienMaPT(mapt) ;
    }
}
