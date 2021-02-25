/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO {

    public ArrayList<NhanVienDTO> loadDataNhanVien() {
        ArrayList<NhanVienDTO> DSNhanVien = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
       
        Statement statement = null;
        
        try {                                           
            String sql = "select * from nhanvien";
            statement = connect.conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
                NhanVienDTO nv = new NhanVienDTO(rs.getString("manv"), 
                        rs.getString("tennv"), rs.getString("sdt"), rs.getString("diachi"), rs.getString("nhiemvu"));                
                DSNhanVien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        connect.MySQLDisconnect();                        
        return DSNhanVien;
    }


    public static void addNhanVien(NhanVienDTO nv) {
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into nhanvien value('";
           sql += nv.getMaNV()+"','"+nv.getTenNV()+"','"+nv.getSDT()+"','"+nv.getDiaChi()+"','"+nv.getNhiemVu()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();    
    }



    public static void editNhanVien(NhanVienDTO pt,String data) {
        PreparedStatement ps = null;
        String query = "update nhanvien set tennv=?, sdt=? , diachi=?, nhiemvu=? where manv=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, pt.getTenNV());
            ps.setString(2, pt.getSDT());
            ps.setString(3, pt.getDiaChi());
            ps.setString(4, pt.getNhiemVu());
            ps.setString(5, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }


    public static void removeNhanVien(String manv) {
        MySQLConnect connect = new MySQLConnect();
        try{
          String sql= "delete from nhanvien where manv='"+manv+"'";

          connect.st = connect.conn.createStatement();
          connect.st.executeUpdate(sql);

        }catch(SQLException ex){
          Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }    


    
}
