/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import Model.Message;
import Model.MessageType;
import Model.Response;
import Record.StudentAttendanceRecord;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class StudentAddAttendance {
     public void AddAttendance( PreparedStatement prepere,ArrayList<StudentAttendanceRecord> setStdlist, Response response){
         boolean flag=false;
             String error="";
             String stacktrace="";
             int inserted=0;
             
         
    for(StudentAttendanceRecord att: setStdlist){
     
        try {
            prepere.setString(1,att.teacherid);
             prepere.setString(2,att.regno);
       prepere.setString(3,att.attendance);
       prepere.setString(4, (att.date));
   int  rowinserted=prepere.executeUpdate();
    if(rowinserted>0){
        inserted++;
    }
      



        } catch (SQLException ex) {
            flag=true;
          error=ex.getMessage();
        stacktrace=ex.getStackTrace().toString();
            
            
          
        }
       
      
       
       }
         if(flag){
                  response.messagesList.add(new Message("there is some sort of error in student adding attendance please contact to suppport", MessageType.Error));
         
                  response.messagesList.add(new Message("error in  add student attendance"+error+"\stack trace +\n"+stacktrace,MessageType.Exception));
       
         }if(inserted>0)
  response.messagesList.add(new Message("student attendance added succesfully",MessageType.Information));

     
     }
}

