/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import AttendanceRecord.StudentRecord;
import Data_access_layer.DatabaseManager;
import java.util.ArrayList;



/**
 *
 * @author hp
 */
public class AttendanceController {
     DatabaseManager dm;
   public AttendanceController(){

        dm=Acontroller.getInstanceOfDatabaseManager();
    }

    public ArrayList<StudentRecord> viewstudents() {
        return dm.getlist();
    }
     public void forquery(String query){
     
     dm.getquery(query);
     
     }

 

        

}

    
  
    

