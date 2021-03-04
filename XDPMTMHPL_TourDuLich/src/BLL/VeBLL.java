/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.VeDAOImp;
import DTO.VeDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class VeBLL {
    VeDAOImp ve = new VeDAOImp();

    public ArrayList<VeDTO> loadDataVe() {
        return ve.loadDataVe();
    }

    public boolean addVe(VeDTO pt) {
        return ve.addVe(pt);
    }

    public boolean editVe(VeDTO pt, String data) {
        return ve.editVe(pt, data);
    }

    public boolean removeVe(String data) {
        return ve.removeVe(data);
    }
}
