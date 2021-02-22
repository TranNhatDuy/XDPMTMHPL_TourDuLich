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

    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList<KhachSanDTO> loadDataKhachSan() {
        String query = "SELECT * FROM khachsan";
        ArrayList<KhachSanDTO> khachsan = new ArrayList<>();
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
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
    public Boolean addKhachSan(KhachSanDTO ks) {
        String query = "INSERT INTO khachsan(MaKS,TenKS,Gia) VALUE(?,?,?)";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, ks.getMaks());
            ps.setString(2, ks.getTenks());
            ps.setFloat(3, ks.getGia());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean editKhachSan(KhachSanDTO ks, String data) {
        String query = "UPDATE khachsan SET TenKS=?,Gia=? WHERE MaKS=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, ks.getTenks());
            ps.setFloat(2, ks.getGia());
            ps.setString(3, data);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean removeKhachSan(KhachSanDTO ks, String data) {
        String query = "DELETE FROM khachsan WHERE MaKS=?";
        try {
            ps=new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, data);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
