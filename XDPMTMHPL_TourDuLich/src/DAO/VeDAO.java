/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.VeDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface VeDAO {

    ArrayList<VeDTO> loadDataVe();

    Boolean addVe(VeDTO kh);

    Boolean editVe(VeDTO kh);

    Boolean removeVe(VeDTO kh);

    ArrayList<VeDTO> searchVeMaVe(String data);

    ArrayList<VeDTO> searchVeThoiGianDat(String data);

    ArrayList<VeDTO> searchVeTrangThai(String data);

    ArrayList<VeDTO> searchVeGia(String data);

}
