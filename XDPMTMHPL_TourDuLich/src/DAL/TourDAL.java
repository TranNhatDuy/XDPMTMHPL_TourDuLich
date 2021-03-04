/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TourDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vo Duy Kiet
 */
public class TourDAL {

    private PreparedStatement ps;
    private ResultSet rs;

    
    public ArrayList<TourDTO> loadDataTour() {

        ArrayList<TourDTO> tourList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tour";
            ps = new MySQLConnect().conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TourDTO tour = new TourDTO(rs.getString("MaTour"), rs.getString("Ten"),
                        rs.getDate("NgayBD"), rs.getDate("NgayKT"),
                        rs.getFloat("Gia"), rs.getInt("Soluong"),
                        rs.getString("MaPT"), rs.getString("MaKS"));
                tourList.add(tour);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tourList;
    }

    
    public Boolean addTour(TourDTO tour) {

        String sql = "INSERT INTO `tour`(`MaTour`, `Ten`, `NgayBD`, `NgayKT`, `Gia`, `Soluong`, `MaPT`, `MaKS`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = new MySQLConnect().conn.prepareCall(sql);
            ps.setString(1, tour.getMatour());
            ps.setString(2, tour.getTentour());
            ps.setDate(3, tour.getNgaybd());
            ps.setDate(4, tour.getNgaykt());
            ps.setFloat(5, tour.getGia());
            ps.setInt(6, tour.getSoluong());
            ps.setString(7, tour.getPhuongtien());
            ps.setString(8, tour.getKhachsan());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Boolean editTour(TourDTO tour,String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Boolean removeTour(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}