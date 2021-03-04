/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachSanDAL;
import DTO.KhachSanDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachSanBLL {

    private KhachSanDAL khachsan = new KhachSanDAL();

    public ArrayList<KhachSanDTO> loadDataKhachSan() {
        return khachsan.loadDataKhachSan();
    }

    public boolean addKhachSan(KhachSanDTO pt) {
        return khachsan.addKhachSan(pt);
    }

    public boolean editKhachSan(KhachSanDTO pt, String data) {
        return khachsan.editKhachSan(pt, data);
    }

    public boolean removeKhachSan(String data) {
        return khachsan.removeKhachSan(data);
    }
}
