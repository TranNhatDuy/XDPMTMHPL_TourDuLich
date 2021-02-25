/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface NhanVienDAO {
     ArrayList<NhanVienDTO> loadDataNhanVien();

    Boolean addNhanVien(NhanVienDTO kh);

    Boolean editNhanVien(NhanVienDTO kh);

    Boolean removeNhanVien(NhanVienDTO kh);

    ArrayList<NhanVienDTO> searchNhanVienMaKH(String data);

    ArrayList<NhanVienDTO> searchNhanVienTenKH(String data);

    ArrayList<NhanVienDTO> searchNhfanVienSDT(String data);

    ArrayList<NhanVienDTO> searchNhanVienDiaChi(String data);
}
