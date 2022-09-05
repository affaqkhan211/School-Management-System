/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Record.StudentRecord;
import Data_access_layer.DatabaseManager;
import Model.Response;
import ui.attendance_module.FillProgressBar;
import ui.attendance_module.updatedListFromTab;
import Record.StudentAttendanceRecord;

import java.util.ArrayList;
import java.sql.*;




/**
 *
 * @author hp
 */
public class AttendanceController {
     DatabaseManager dm;

   public AttendanceController(){

        dm=ObjectsFactory.getInstanceOfDatabaseManager();
       
    }

    public ArrayList<StudentRecord> teacherview() {
    return dm.teacherviewattendance();
    }
     public ArrayList<StudentRecord> viewstudentlist() {
      
        return dm.studentlist(); 
    }

      public ArrayList<StudentRecord> modifyview(String date) {
      
        return dm.modifyAttendanceList(date);
    }
      
      public void updateStudentAttendance(ArrayList<StudentAttendanceRecord> stdlist,String date) throws SQLException{
    Response response=new Response();
    
    dm.insertUpdAtt(stdlist, date,response);
    }
      
 

//     public PreparedStatement insert(String query){
//     return dm.insertrecord(query);
//     
//     }
    
   
       public Response addattendance(ArrayList<StudentAttendanceRecord> setstdList){
           Response response =new Response();
           
  
              dm.insertattendance(setstdList,response);
           return response;
       }
 
 public ArrayList<StudentRecord> studentview(String regnum) {
      
        return dm.studentviewlist(regnum);
    }
        
  public ArrayList<StudentRecord> adminview(String Class){
  
  
    return dm.adminviewlist(Class);
  }
}

    
  
    

