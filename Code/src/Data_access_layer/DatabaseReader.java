/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


/**
 *
 * @author hp
 */
public class DatabaseReader {
    

   Resultset getRecord(String query,Connection connect) throws ClassNotFoundException{
      
      Class.forName("com.mysql.cj.jdbc.Driver");
       try {
           Statement sm =connect.createStatement();
           
          return (Resultset) sm.executeQuery(query);
       } catch (SQLException e) {
       }
       
       
       return null;
       
      
}
}