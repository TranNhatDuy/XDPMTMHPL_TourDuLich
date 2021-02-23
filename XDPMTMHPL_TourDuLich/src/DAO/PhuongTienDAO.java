/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
