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

    boolean addNhanVien(NhanVienDTO nv);

    boolean editNhanVien(NhanVienDTO nv, String data);
    
    boolean removeNhanVien(String data); 
}
