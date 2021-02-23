/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhuongTienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vo Duy Kiet
 */
public class PhuongTienDAOImp implements PhuongTienDAO{

    @Override
    public ArrayList<PhuongTienDTO> loadDataPhuongTien() {
        ArrayList<PhuongTienDTO> DSPhuongTien = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
       
        Statement statement = null;
        
        try {                                           
            String sql = "select * from phuongtien";
            statement = connect.conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
                PhuongTienDTO pt = new PhuongTienDTO(rs.getString("mapt"), 
                        rs.getString("tenpt"), rs.getFloat("gia"));                
                DSPhuongTien.add(pt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        connect.MySQLDisconnect();                        
        return DSPhuongTien;
    }

    @Override
    public Boolean addPhuongTien(PhuongTienDTO kh) {
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into phuongtien value('";
           sql += kh.getMapt()+"','"+kh.getTenpt()+"','"+kh.getGia()+"')";
           connect.st = (com.mysql.jdbc.Statement) connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();
        return false;
    }

    public Boolean editPhuongTien(PhuongTienDTO pt,String mapt) {
        PreparedStatement ps = null;
        String query = "update phuongtien set tenpt=?, gia=? where mapt=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, pt.getTenpt());
            ps.setFloat(2, pt.getGia());
            ps.setString(3, mapt);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean removePhuongTien(String mapt) {
        MySQLConnect connect = new MySQLConnect();
        try{
          String sql= "delete from phuongtien where mapt='"+mapt+"'";

          connect.st = connect.conn.createStatement();
          connect.st.executeUpdate(sql);

        }catch(SQLException ex){
          Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return false;
    }

    @Override
    public ArrayList<PhuongTienDTO> searchPhuongTienMaPT(String mapt) {
        ArrayList<PhuongTienDTO> DSPhuongTien = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
       
        Statement statement = null;
        
        try {                                           
            String sql = "select * from phuongtien where mapt='"+mapt+"'";
            statement = connect.conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
                PhuongTienDTO pt = new PhuongTienDTO(rs.getString("mapt"), 
                        rs.getString("tenpt"), rs.getFloat("gia"));                
                DSPhuongTien.add(pt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhuongTienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        connect.MySQLDisconnect();                        
        return DSPhuongTien;
    }

    public ArrayList<PhuongTienDTO> searchPhuongTienTenPT(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<PhuongTienDTO> searchPhuongTienGia(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean removePhuongTien(PhuongTienDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean editPhuongTien(PhuongTienDTO kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
