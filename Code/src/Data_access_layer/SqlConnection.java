/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hp
 */
public class SqlConnection implements Iconnection{
    private  String servername;
     private  String dbname;
     private  String dbusername;
      private  String dbpassword;

    public SqlConnection(String servername, String dbusername,String dbpassword) {
        
        this.servername=servername;
        this.dbusername=dbusername;
        this.dbpassword=dbpassword;
    }

  
    @Override
    public Connection getConnection() {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
           return DriverManager.getConnection(this.servername,this.dbusername,this.dbpassword);
            
           
           
        } catch (SQLException e) {
            
            System.out.println("error in getconnection()"+e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Data_access_layer.SqlConnection.getConnection()"+ex.getMessage());
        }
        return null;
    }
     
      
      
      
}
