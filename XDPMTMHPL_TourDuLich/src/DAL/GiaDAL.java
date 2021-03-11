/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.GiaDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String query = "SELECT * FROM tour_gia";
        try {
            ps=new MySQLConnect().conn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                GiaDTO g=new GiaDTO();
                g.setMagia(rs.getString("gia_id"));
                g.setSotien(rs.getInt("gia_sotien"));
                g.setNgaydi(rs.getString("gia_tungay"));
                g.setNgayden(rs.getString("gia_denngay"));
                g.setMatour(rs.getString("tour_id"));
                gia.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gia;
    }
}
