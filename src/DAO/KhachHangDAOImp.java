/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHangDTO;
import UTILS.MyDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachHangDAOImp implements KhachHangDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<KhachHangDTO> khachhang = new ArrayList<>();
   
    @Override
    public ArrayList<KhachHangDTO> loadDataKhachHang() {
        String query = "SELECT * FROM khachhang";
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMakh(rs.getString("MaKH"));
                kh.setTenkh(rs.getString("Ten"));
                kh.setSdt(rs.getString("SDT"));
                kh.setDiachi(rs.getString("DiaChi"));
                khachhang.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return khachhang;

    }

    @Override
    public Boolean addKhachHang(KhachHangDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean editKhachHang(KhachHangDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean removeKhachHang(KhachHangDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHangDTO> searchKhachHangMaKH(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHangDTO> searchKhachHangTenKH(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHangDTO> searchKhachHangSDT(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHangDTO> searchKhachHangDiaChi(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
