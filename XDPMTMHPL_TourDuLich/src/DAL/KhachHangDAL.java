/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachHangDAL {

    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<KhachHangDTO> loadDataKhachHang() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<KhachHangDTO> ds = new ArrayList<KhachHangDTO>();
        try {
            String query = "select * from khachhang";
            st = new MySQLConnect().conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMakh(rs.getString(1));
                kh.setMadoan(rs.getString(2));
                kh.setTenkh(rs.getString(3));
                kh.setSdt(rs.getString(4));
                kh.setNgaysinh(rs.getString(5));
                kh.setEmail(rs.getString(6));
                ds.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ds;
    }

    public Boolean addKhachHang(KhachHangDTO kh) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MySQLConnect Connect = new MySQLConnect();
        try {
            String query = "insert into khachhang values('";
            query += kh.getMakh() + "','" + kh.getMadoan() + "','" + kh.getTenkh() + "','"
                    + kh.getSdt() + "','" + kh.getNgaysinh() + "','" + kh.getEmail() + "')";
            Connect.st = Connect.conn.createStatement();
            Connect.st.executeUpdate(query);
//            if(Connect.rs.next() == true){
//                JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            }
        } catch (Exception e) {
            System.out.println(e);
        }

        Connect.MySQLDisconnect();
        return true;
    }

    public Boolean editKhachHang(KhachHangDTO kh, String data) {
        String query = "UPDATE khachhang SET madoan=?,tenkh=?,sdt=?,ngaysinh=?,email=? WHERE makh=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, kh.getMadoan());
            ps.setString(2, kh.getTenkh());
            ps.setString(3, kh.getSdt());
            ps.setString(4, kh.getNgaysinh());
            ps.setString(5, kh.getEmail());
            ps.setString(6, data);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean removeKhachHang(KhachHangDTO kh) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MySQLConnect Connect = new MySQLConnect();
        try {
            String query = "DELETE FROM `khachhang` WHERE MaKH = " + "'" + kh.getMakh() + "'";
            st = new MySQLConnect().conn.createStatement();
            Connect.st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        Connect.MySQLDisconnect();
        return true;
    }
}
