/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DoanDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUYNHVIETBINH
 */
public class DoanDAL {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static MySQLConnect connect = new MySQLConnect();
    public static Statement statement;

    public ArrayList<DoanDTO> loadDataDoan() {
        ArrayList<DoanDTO> DSDoan = new ArrayList<>();
        try {
            String sql = "select * from doan";
            statement = connect.conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DoanDTO d = new DoanDTO(rs.getString("madoan"),
                        rs.getString("matour"), rs.getString("tendoan"), rs.getString("ngaydi"),
                        rs.getString("ngayve"), rs.getString("chitietchuongtrinh"));
                DSDoan.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
        return DSDoan;
    }
}
