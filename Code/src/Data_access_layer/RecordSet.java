/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;
import java.sql.*;


/**
 *
 * @author hp
 */
public class RecordSet {
    private String query;
private Connection conn;
   PreparedStatement setRecord(String query,Connection conn){
        try {
             return  conn.prepareStatement(query);
        } catch (SQLException ex) {
            System.out.println("error in setrecord() in Recordset"+ex.getMessage());
        }
        return null;
  
    }
    
}
