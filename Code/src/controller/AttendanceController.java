/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Record.StudentRecord;
import Data_access_layer.DatabaseManager;
import Model.FillProgressBar;
import Model.updatedListFromTab;
import Record.StudentAttendanceRecord;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JProgressBar;
import javax.swing.JTable;



/**
 *
 * @author hp
 */
public class AttendanceController {
     DatabaseManager dm;
     FillProgressBar Fill;
     updatedListFromTab updlist;
   public AttendanceController(){

        dm=ObjectsFactory.getInstanceOfDatabaseManager();
        Fill=ObjectsFactory.getinstanceofProgressBar();
         updlist=ObjectsFactory.getinstanceofupdaFromTab();
    }

    public ArrayList<StudentRecord> viewstudents() {
      String query="select * from studentatt";
        return dm.getlist(query);
    }
     public ArrayList<StudentRecord> viewStudents() {
      String query="select distinct * from students";
        return dm.getlist(query);
    }

      public ArrayList<StudentRecord> viewupdstudents(String date) {
      String query="select * from studentatt where _date="+"'"+date+"'";
        return dm.getlist(query);
    }
      
      public void updStudentAtt(ArrayList<StudentAttendanceRecord> stdlist,String date) throws SQLException{
    String query="update attendance SET att_status=? where date="+"'"+date+"'";
    dm.insertUpdAtt(stdlist, query);
    }
      
    public ArrayList<StudentAttendanceRecord> getattList(JTable table ,JDateChooser date){
    
    return updlist.Fetch(table,date);
    
    }

     public PreparedStatement insert(String query){
     return dm.insertrecord(query);
     
     }
    
     public void fillbar(JProgressBar b,JProgressBar b1,ArrayList<StudentRecord> list){
         
     
     Fill.fill(b, b1, list);
     }
       public void insertAttendance(ArrayList<StudentAttendanceRecord> setstdList) throws SQLException{
       String query="insert into attendance (teacher_id,reg_num,att_status,_date) values (?,?,?,?)";
       dm.insertAtt(setstdList,query);
       
       }
 
 public ArrayList<StudentRecord> viewstudent(String regnum) {
      String query="select * from studentatt where reg_num="+"'"+regnum+"'";
        return dm.getlist(query);
    }
        
  public ArrayList<StudentRecord> AdAttendance(String Class){
  
  String Query="select * from studentatt where class="+"'"+Class+"'";
    return dm.getlist(Query);
  }
}

    
  
    

