/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DiaDiemDTO;
import DTO.GiaDTO;
import DTO.TourDTO;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class GiaDAL {

    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<GiaDTO> loadDataGia() {
        ArrayList<GiaDTO> gia = new ArrayList<>();
        String query = "SELECT * FROM gia";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                GiaDTO g = new GiaDTO();
                TourDTO t=new TourDTO();

                t.setMatour(rs.getString("matour"));
                g.setMagia(rs.getString("magia"));
                g.setTour(t);
                g.setSotien(rs.getInt("sotien"));
                g.setTungay(rs.getString("tungay"));
                g.setDenngay(rs.getString("denngay"));
                gia.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gia;
    }

    public boolean addGia(GiaDTO g) {
        String query = "INSERT INTO gia(magia,madd,sotien,tungay,denngay) VALUES(?,?,?,?,?)";
        try {

            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, g.getMagia());
            ps.setString(2, g.getTour().getMatour());
            ps.setInt(3, g.getSotien());
            ps.setString(4, g.getTungay());
            ps.setString(5, g.getDenngay());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editGia(GiaDTO g, String data) {
        String query = "UPDATE gia SET madd=?,sotien=?,tungay=?,denngay=? WHERE magia=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, g.getTour().getMatour());
            ps.setInt(2, g.getSotien());
            ps.setString(3, g.getTungay());
            ps.setString(4, g.getDenngay());
            ps.setString(5, data);  
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean removeGia(GiaDTO g, String data) {
        String query = "DELETE FROM gia WHERE magia=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, data);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
