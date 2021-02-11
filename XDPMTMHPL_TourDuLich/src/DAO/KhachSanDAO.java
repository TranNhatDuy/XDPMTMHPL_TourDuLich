/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachSanDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface KhachSanDAO {

    ArrayList<KhachSanDTO> loadDataKhachSan();

    Boolean addKhachSan(KhachSanDTO kh);

    Boolean editKhachSan(KhachSanDTO kh);

    Boolean removeKhachSan(KhachSanDTO kh);

    ArrayList<KhachSanDTO> searchKhachSanMaKS(String data);

    ArrayList<KhachSanDTO> searchKhachSanTenKS(String data);

    ArrayList<KhachSanDTO> searchKhachSanGia(String data);

}
