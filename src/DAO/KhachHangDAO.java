/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface KhachHangDAO {

    ArrayList<KhachHangDTO> loadDataKhachHang();

    Boolean addKhachHang(KhachHangDTO kh);

    Boolean editKhachHang(KhachHangDTO kh);

    Boolean removeKhachHang(KhachHangDTO kh);

    ArrayList<KhachHangDTO> searchKhachHangMaKH(String data);

    ArrayList<KhachHangDTO> searchKhachHangTenKH(String data);

    ArrayList<KhachHangDTO> searchKhachHangSDT(String data);

    ArrayList<KhachHangDTO> searchKhachHangDiaChi(String data);

}
