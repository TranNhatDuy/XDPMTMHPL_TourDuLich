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

    Boolean addVe(VeDTO v);

    Boolean editVe(VeDTO v, String data);

    Boolean removeVe(String data);

}
