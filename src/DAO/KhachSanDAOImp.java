/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.KhachSanDTO;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachSanDAOImp implements KhachSanDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<KhachSanDTO> khachsan = new ArrayList<>();

    @Override
    public ArrayList<KhachSanDTO> loadDataKhachSan() {
        String query = "SELECT * FROM khachhang";
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachSanDTO ks = new KhachSanDTO();
                ks.setMaks(rs.getString("MaKS"));
                ks.setTenks(rs.getString("TenKS"));
                ks.setGia(rs.getFloat("Gia"));
                khachsan.add(ks);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return khachsan;

    }

    @Override
    public Boolean addKhachSan(KhachSanDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean editKhachSan(KhachSanDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean removeKhachSan(KhachSanDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachSanDTO> searchKhachSanMaKS(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachSanDTO> searchKhachSanTenKS(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachSanDTO> searchKhachSanGia(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
