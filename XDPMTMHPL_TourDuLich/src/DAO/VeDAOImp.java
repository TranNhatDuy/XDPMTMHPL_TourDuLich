/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHangDTO;
import DTO.TourDTO;
import DTO.VeDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class VeDAOImp implements VeDAO {

    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList<VeDTO> loadDataVe() {
        ArrayList<VeDTO> ve = new ArrayList<>();
        String query = "SELECT * FROM ve";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                VeDTO v = new VeDTO();
                KhachHangDTO kh = new KhachHangDTO();
                TourDTO t = new TourDTO();
                v.setMave(rs.getString("MaVe"));
                t.setMatour(rs.getString("MaTour"));
                v.setTour(t);
                kh.setMakh(rs.getString("MaKH"));
                v.setKhachhang(kh);
                v.setThoigiandat(rs.getDate("Thoigiandat"));
                v.setTrangthai(rs.getString("Trangthai"));
                v.setGia(rs.getFloat("Gia"));
                ve.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ve;
    }

    @Override
    public Boolean addVe(VeDTO v) {
        String query = "INSERT INTO ve(MaVe,MaTour,MaKH,Thoigiandat,Trangthai,Gia) VALUE(?,?,?,?,?,?)";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, v.getMave());
            ps.setString(2, v.getTour().getMatour());
            ps.setString(3, v.getKhachhang().getMakh());
            ps.setDate(4, v.getThoigiandat());
            ps.setString(5, v.getTrangthai());
            ps.setFloat(6, v.getGia());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean editVe(VeDTO v, String data) {
        String query = "UPDATE ve SET MaTour=?,MaKH=?,Thoigiandat=?,Trangthai=?"
                + ",Gia=? WHERE MaVe=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, v.getTour().getMatour());
            ps.setString(2, v.getKhachhang().getMakh());
            ps.setDate(3, v.getThoigiandat());
            ps.setString(4, v.getTrangthai());
            ps.setFloat(5, v.getGia());
            ps.setString(6, data);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean removeVe(VeDTO v, String data) {
        String query = "DELETE FROM ve WHERE MaVe=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, data);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<VeDTO> searchVeMaVe(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeDTO> searchVeThoiGianDat(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeDTO> searchVeTrangThai(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VeDTO> searchVeGia(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
