/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Record.StudentAttendanceRecord;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class updatedListFromTab {
    
    public ArrayList<StudentAttendanceRecord> Fetch(JTable table ,JDateChooser date){
       ArrayList<StudentAttendanceRecord> setStdlist=new ArrayList<>();
         
         DefaultTableModel model=(DefaultTableModel) table.getModel();
         
       // java.sql.Date sqldate = new java.sql.Date(date.getDate());
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
       int j=model.getRowCount();
       
       for(int i=0; i<j; i++){
        StudentAttendanceRecord AttendanceRecord =new StudentAttendanceRecord();
       AttendanceRecord.regno = (String)model.getValueAt(i,0);
        AttendanceRecord.teacherid= "115";
        AttendanceRecord.date=sdf.format(date.getDate());
//        Date date=Date.valueOf(AttendanceRecord.date);
        Object o = model.getValueAt(i,3);
        if(o == null || !(Boolean) model.getValueAt(i,3)){
          AttendanceRecord.attendance="absent";
       }
        else{
            AttendanceRecord.attendance="present";
        }
        setStdlist.add(AttendanceRecord);
       }
    return setStdlist;
    
    }
    
}
