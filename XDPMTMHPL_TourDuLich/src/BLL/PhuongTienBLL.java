/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.PhuongTienDAOImp;
import DTO.PhuongTienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class PhuongTienBLL {

    PhuongTienDAOImp phuongtien = new PhuongTienDAOImp();

    public ArrayList<PhuongTienDTO> loadDataPhuongTien() {
        return phuongtien.loadDataPhuongTien();
    }

    public boolean addPhuongTien(PhuongTienDTO pt) {
        return phuongtien.addPhuongTien(pt);
    }

    public boolean editPhuongTien(PhuongTienDTO pt, String data) {
        return phuongtien.editPhuongTien(pt, data);
    }

    public boolean removePhuongTien(String mapt) {
        return phuongtien.removePhuongTien(mapt);
    }

//    public ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String mapt) {
//        return phuongtien.searchPhuongTienMaPT(mapt);
//    }
}
