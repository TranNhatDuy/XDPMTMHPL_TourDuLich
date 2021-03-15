/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TourDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ThongKeDAL {
    
    public static int thongkedoanhthuTour(String matour) {
        MySQLConnect connect = new MySQLConnect();
        int sl=0, sotien=0, kq=0;       
        Statement statement;                        
        try {                                           
            String sql = "SELECT COUNT(*) as soluong FROM khachhang kh, doan d WHERE kh.madoan = d.madoan and d.matour= '"+matour+"'";
            String sql1 = "SELECT g.sotien as sotien FROM tours t, diadiem dd, gia g WHERE t.madd = dd.madd and dd.madd = g.madd and t.matour= '"+matour+"'";
            statement = connect.conn.createStatement();           
            ResultSet rs = statement.executeQuery(sql); 
            while (rs.next()) {
                sl = rs.getInt("soluong");
            }  
            ResultSet rs1 = statement.executeQuery(sql1); 
            while (rs1.next()) {
                sotien = rs1.getInt("sotien");
            } 
            kq = sl * sotien;
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        connect.MySQLDisconnect();
        return kq;
    }
    
    public static int thongkedchiphiTour(String matour) {
        MySQLConnect connect = new MySQLConnect();
        int kq=0;       
        Statement statement;                        
        try {                                           
            String sql = "SELECT SUM(cp.tongchiphi) as chiphi FROM chiphi cp, doan d WHERE cp.madoan = d.madoan and d.matour= '"+matour+"'";
            statement = connect.conn.createStatement();           
            ResultSet rs = statement.executeQuery(sql); 
            while (rs.next()) {
                kq = rs.getInt("chiphi");
            }  
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        connect.MySQLDisconnect();
        return kq;
    }
}
