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

    Boolean addPhuongTien(PhuongTienDTO kh);

    Boolean editPhuongTien(PhuongTienDTO kh);

    Boolean removePhuongTien(PhuongTienDTO kh);

    ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String data);

    ArrayList<PhuongTienDTO> searchPhuongTienTenPT(String data);

    ArrayList<PhuongTienDTO> searchPhuongTienGia(String data);

}
