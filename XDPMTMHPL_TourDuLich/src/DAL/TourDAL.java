
package DAL;

import DTO.TourDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TourDAL {

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static MySQLConnect connect = new MySQLConnect();
    public static Statement statement;
    
    public ArrayList<TourDTO> loadDataTour() {
        ArrayList<TourDTO> DSTour = new ArrayList<>();                     
        try {                                           
            String sql = "select * from tours";
            statement = connect.conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
                TourDTO dd = new TourDTO(rs.getString("matour"), 
                        rs.getString("tentour"), rs.getString("madd"), rs.getString("mota"));                
                DSTour.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        connect.MySQLDisconnect();
        return DSTour;
    }
  
    public static void addTour(TourDTO t) {      
        try{
           String sql = "insert into tours value('";
           sql += t.getMatour()+"','"+t.getTentour()+"','"+t.getMadd()+"','"+t.getMota()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();
    }

    public static void editTour(TourDTO t,String data) {
        String query = "update tours set tentour=?, madd=?, mota=? where matour=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, t.getTentour());
            ps.setString(2, t.getMadd());
            ps.setString(3, t.getMota());
            ps.setString(4, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }  
        connect.MySQLDisconnect();
    }

    public static void removeTour(String matour) {      
        try{     
            String sql= "delete from tours where matour='"+matour+"'";
            connect.st = connect.conn.createStatement();
            connect.st.executeUpdate(sql);
        }catch(SQLException ex){
          Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
        connect.MySQLDisconnect();
    }    

}
