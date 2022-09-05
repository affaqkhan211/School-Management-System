/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;
import Model.Message;
import Model.MessageType;
import Model.Response;
import java.sql.*;


/**
 *
 * @author hp
 */
public class RecordSet {
    private String query;
private Connection conn;
   PreparedStatement setRecord(String query,Connection conn,Response response){
        try {
             return  conn.prepareStatement(query);
        } catch (SQLException ex) {
            response.messagesList.add(new Message("there is some sort of error in interacting with database record please contact to support",MessageType.Error));
            response.messagesList.add(new Message("error in setRecord() method in Record set",MessageType.Exception));
        }
        return null;
  
    }
    
}
