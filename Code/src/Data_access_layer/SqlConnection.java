/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author hp
 */
public class SqlConnection implements Iconnection{
    private  String servername;
     private  String dbname;
     private  String dbusername;
      private  String dbpassword;

    public SqlConnection(String servername,String dbname, String dbusername,String dbpassword) {
        this.dbname=dbname;
        this.servername=servername;
        this.dbusername=dbusername;
        this.dbpassword=dbpassword;
    }

    @Override
    public Connection getConnection() {
        try {
             
            return DriverManager.getConnection("jdbc:mysql://"+this.servername+";databaseName="+this.dbname,this.dbusername,this.dbpassword);
            
        } catch (SQLException e) {
            
            System.out.println("error in getconnection()"+e.getMessage());
        }
        return null;
    }
     
      
      
      
}
