/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


/**
 *
 * @author hp
 */
public class DatabaseReader {
private String query;
private Connection conn;

 
    

   ResultSet getRecord(String query,Connection conn) {
      
      
       try {
           Statement sm =conn.createStatement();
         
           
          return (ResultSet) sm.executeQuery(query);
       } catch (SQLException e) {
           
           System.out.println("error in getrecord()"+e.getMessage());
       }
       
       
       return null;
       
      
}
}