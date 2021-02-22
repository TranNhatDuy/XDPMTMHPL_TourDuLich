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

    Boolean addKhachSan(KhachSanDTO ks);

    Boolean editKhachSan(KhachSanDTO ks,String data);

    Boolean removeKhachSan(KhachSanDTO ks,String data);

    ArrayList<KhachSanDTO> searchKhachSanMaKS(String data);

    ArrayList<KhachSanDTO> searchKhachSanTenKS(String data);

    ArrayList<KhachSanDTO> searchKhachSanGia(String data);

}
