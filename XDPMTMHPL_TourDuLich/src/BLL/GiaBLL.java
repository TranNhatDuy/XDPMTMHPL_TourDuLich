/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.GiaDAL;
import DTO.GiaDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class GiaBLL {
    private GiaDAL gia = new GiaDAL();

    public ArrayList<GiaDTO> loadDataGia() {
        return gia.loadDataGia();
    }

    public boolean addGia(GiaDTO g) {
        return gia.addGia(g);
    }

    public boolean editGia(GiaDTO g, String data) {
        return gia.editGia(g, data);
    }

    public boolean removeGia(GiaDTO g,String data) {
        return gia.removeGia(g,data);
    }
}
