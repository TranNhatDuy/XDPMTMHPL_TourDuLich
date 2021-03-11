
package DAL;

import DTO.TourDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TourDAL {

    private PreparedStatement ps;
    private ResultSet rs;

    
    public ArrayList<TourDTO> loadDataTour() {
        ArrayList<TourDTO> DSTour = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
        
        Statement statement = null;
        
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
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into tour value('";
           sql += t.getMatour()+"','"+t.getTentour()+"','"+t.getMadd()+"','"+t.getMota()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(TourDTO.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();    
    }



    public static void editTour(TourDTO t,String data) {
        PreparedStatement ps = null;
        String query = "update tour set tentour=?, mota=? where matour=?";
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
    }


    public static void removeTour(String matour) {
        MySQLConnect connect = new MySQLConnect();
        try{
          String sql= "delete from tour where matour='"+matour+"'";

          connect.st = connect.conn.createStatement();
          connect.st.executeUpdate(sql);

        }catch(SQLException ex){
          Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }    

}
