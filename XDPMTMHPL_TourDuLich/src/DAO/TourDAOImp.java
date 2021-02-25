/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class TourDAOImp implements TourDAO{

    private PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public ArrayList<TourDTO> loadDataTour() {
        
        ArrayList<TourDTO> tourList = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM tour, khachsan, phuongtien WHERE tour.MaPT = phuongtien.MaPT AND tour.MaKS = khachsan.MaKS";
            ps = new MySQLConnect().conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                TourDTO tour = new TourDTO(rs.getString("MaTour"), rs.getString("Ten"), 
                        rs.getDate("NgayBD"), rs.getDate("NgayKT"), 
                        rs.getFloat("Gia"), rs.getInt("Soluong"),
                        rs.getString("TenPT"), rs.getString("TenKS"));                
                tourList.add(tour);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tourList;
    }

    @Override
    public Boolean addTour(TourDTO kh) {
        
        String sql = "INSERT INTO `tour`(`MaTour`, `Ten`, `NgayBD`, `NgayKT`, `Gia`, `Soluong`, `MaPT`, `MaKS`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = new MySQLConnect().conn.prepareCall(sql);
            ps.setString(1, kh.getMatour());
            ps.setString(2, kh.getTentour());
            ps.setDate(3, kh.getNgaybd());
            ps.setDate(4, kh.getNgaykt());
            ps.setFloat(5, kh.getGia());
            ps.setInt(6, kh.getSoluong());
            ps.setString(7, kh.getPhuongtien());
            ps.setString(8, kh.getKhachsan());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TourDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean editTour(TourDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean removeTour(TourDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TourDTO> searchTourMaTour(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TourDTO> searchTourTenTour(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TourDTO> searchTourNgayBD(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TourDTO> searchTourNgayKT(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TourDTO> searchTourGia(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
