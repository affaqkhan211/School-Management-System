/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import Record.StudentAttendanceRecord;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class StudentAddAttendance {
     public void AddAttendance( PreparedStatement prepere,ArrayList<StudentAttendanceRecord> setStdlist) throws SQLException{
    for(StudentAttendanceRecord att: setStdlist){
     
       prepere.setString(1,att.teacherid);
       prepere.setString(2,att.regno);
       prepere.setString(3,att.attendance);
       prepere.setString(4, (att.date));
       prepere.executeUpdate();
       
       }
 
     }
}

