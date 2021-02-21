/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachHangDAOImp implements KhachHangDAO {

    
    @Override
    public ArrayList<KhachHangDTO> loadDataKhachHang() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<KhachHangDTO> ds = new ArrayList<KhachHangDTO>();
        MySQLConnect connect = new MySQLConnect();
        try
        {
            String query = "select * from khachhang";
            connect.st = connect.conn.createStatement();
            connect.rs = connect.st.executeQuery(query);
            while(connect.rs.next())
            {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMakh(connect.rs.getString(1));
                kh.setTenkh(connect.rs.getString(2));
                kh.setSdt(connect.rs.getString(3));
                kh.setDiachi(connect.rs.getString(4));
                ds.add(kh);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return ds;  
    }

    @Override
    public Boolean addKhachHang(KhachHangDTO kh) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MySQLConnect Connect = new MySQLConnect();
        try
        {
            String query = "insert into khachhang values('";
            query += kh.getMakh()+"','"+kh.getTenkh()+"','"+kh.getSdt()+"','"+kh.getDiachi()+"')";
            Connect.st = Connect.conn.createStatement();
            Connect.st.executeUpdate(query);
//            if(Connect.rs.next() == true){
//                JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        Connect.MySQLDisconnect();
        return true;
    }

    @Override
    public Boolean editKhachHang(KhachHangDTO kh) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MySQLConnect Connect = new MySQLConnect();
        try
        {
//            String query = "UPDATE khachhang SET ADDRESS = 'Vinh Phuc' WHERE ID = 6;
            
            Connect.st = Connect.conn.createStatement();
            
//            Connect.st.executeUpdate(query);    
//            if(Connect.rs.next() == true){
//                JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        Connect.MySQLDisconnect();
        return true;
    }

    @Override
    public Boolean removeKhachHang(KhachHangDTO kh) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MySQLConnect Connect = new MySQLConnect();
        try
        {
            String query = "DELETE FROM `khachhang` WHERE MaKH = " + "'" + kh.getMakh() + "'";
            
            Connect.st = Connect.conn.createStatement();
            
            Connect.st.executeUpdate(query);    
//            if(Connect.rs.next() == true){
//                JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        Connect.MySQLDisconnect();
        return true;
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
