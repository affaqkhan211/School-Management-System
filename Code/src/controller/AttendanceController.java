/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Record.StudentRecord;
import Data_access_layer.DatabaseManager;
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

    public ArrayList<StudentRecord> viewstudents() {
        return dm.getlist();
    }
     public void fgetquery(String getQuery){
     
     dm.getquery(getQuery);
     
     }
//      public void fsetquery(String setQuery){
//      dm.setquery(setQuery);
//      }
     
     public PreparedStatement insert(String query){
     return dm.insertrecord(query);
     
     }

 

        

}

    
  
    

