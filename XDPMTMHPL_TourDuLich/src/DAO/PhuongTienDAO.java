
package DAO;

import DTO.PhuongTienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface PhuongTienDAO {
    ArrayList<PhuongTienDTO> loadDataPhuongTien();       
     
    Boolean addPhuongTien(PhuongTienDTO pt);

    Boolean editPhuongTien(PhuongTienDTO pt,String mapt);

    Boolean removePhuongTien(String mapt);

    ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String mapt);
   

}
