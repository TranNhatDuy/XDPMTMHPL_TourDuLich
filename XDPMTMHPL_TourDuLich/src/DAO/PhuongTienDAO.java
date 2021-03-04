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

    boolean addPhuongTien(PhuongTienDTO pt);

    boolean editPhuongTien(PhuongTienDTO pt, String data);

    boolean removePhuongTien(String mapt);

//    ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String mapt);
}
