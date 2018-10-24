package icusystem;
import java.sql.*;
import javax.swing.JOptionPane;

public class Checkconnection {
    
    public static void main(String[] args) {
        getconnection();
    }
    
    public static Connection getconnection(){
     
        try{
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lnh?autoReconnect=true&useSSL=false","root","12345678");
               
            return conn;
        }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,e);
        return null;
        }
    
    }
}