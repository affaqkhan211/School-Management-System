/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import Model.Message;
import Model.MessageType;
import Model.Response;
import Record.AssignmentRecord;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class UploadAssignment {
     
   public   void UploadAssi(PreparedStatement prepere,AssignmentRecord record,Response response){
    
       
       try {
              prepere.setInt(1, record.ass_num);
           prepere.setString(2, record.url);
                prepere.setString(3,record.TeacherID);
       prepere.setString(4, record.date);
    int count=   prepere.executeUpdate();
       if(count >0){
       response.messagesList.add(new Message("Assignment uploaded successfully", MessageType.Information));
       
       }
       
       } catch (SQLException ex) {
           
           response.messagesList.add(new Message(" Exception in uploadAssi"+ex.getMessage()+"stack trace"+Arrays.toString(ex.getStackTrace()),MessageType.Exception));
           response.messagesList.add(new Message("there is some sort of problem in uplaod assignment please contact to support", MessageType.Error));
               System.out.println(ex.getMessage());    
       }
  
    
    }
    
    
    
}
