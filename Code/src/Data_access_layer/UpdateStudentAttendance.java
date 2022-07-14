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
public class UpdateStudentAttendance {
    public void updAtt(PreparedStatement prepere,ArrayList<StudentAttendanceRecord> stdlist) throws SQLException{
    for(StudentAttendanceRecord att:stdlist){
     prepere.setString(1,att.attendance);
     prepere.setString(2,att.regno);
    prepere.executeUpdate();
    }
    }
    
    
    
}
