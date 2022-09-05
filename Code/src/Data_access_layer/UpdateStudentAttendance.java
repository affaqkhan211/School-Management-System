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
import java.util.Arrays;


/**
 *
 * @author hp
 */
public class UpdateStudentAttendance {
    public void updAtt(PreparedStatement prepere,ArrayList<StudentAttendanceRecord> stdlist,Response response) {
        boolean flag=false;
        String message="";
        String stacktrace="";
        int count=0;
        
    for(StudentAttendanceRecord att:stdlist){
        try {
            prepere.setString(1,att.attendance);
            prepere.setString(2,att.regno);
            int rowupdated=prepere.executeUpdate();
            if(rowupdated>0)
                count++;
            
        } catch (SQLException ex) {
            flag=true;
            stacktrace=Arrays.toString(ex.getStackTrace());
            message=ex.getMessage();
            
        }
        
        
        
    }
    if(flag){
        response.messagesList.add(new Message("error in updatt() of update student attendace"+message+"\n stack trace \n"+stacktrace,MessageType.Exception));
        response.messagesList.add(new Message("there is some sort of error in updating attendance" ,MessageType.Error));
                    
    }
    if(count>0)
        response.messagesList.add(new Message("attendance updated successfully", MessageType.Information));
    }
    
    
    
}
