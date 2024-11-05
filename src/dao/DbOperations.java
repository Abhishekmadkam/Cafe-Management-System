
package dao;
import java.sql.*;
import javax.swing.JOptionPane;


public class DbOperations {
  
    public static void setDataOrDelete(String Query,String msg){
        try{
            Connection con = ConnectionProvider.getConn();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"Messge",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query){
        try{
            Connection con = ConnectionProvider.getConn();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"Messge",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}