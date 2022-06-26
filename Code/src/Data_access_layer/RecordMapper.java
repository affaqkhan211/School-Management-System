/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import AttendanceRecord.StudentRecord;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author hp
 */
public class RecordMapper {
    
    
     ArrayList<StudentRecord> getStudents(ResultSet rs) {
        ArrayList<StudentRecord> stdlist = new ArrayList<>();
        try{
        while (rs.next())
            {
                StudentRecord objStd=new StudentRecord();                
                objStd.regno=rs.getString("reg_num");
                 objStd.name=rs.getString("fname")+" "+rs.getString("lname");
                 objStd.Class=rs.getString("class");                  
                stdlist.add( objStd);
            }
        }catch (SQLException e){
            System.out.println(" error in getstudent"+e.getMessage());
        }
        return stdlist;
    }
    
    
    
}
