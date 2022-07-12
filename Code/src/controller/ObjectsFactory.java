/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Data_access_layer.DatabaseManager;
import Data_access_layer.RecordMapper;
import Model.FillProgressBar;
import Model.updatedListFromTab;

/**
 *
 * @author hp
 */
public class ObjectsFactory {
    
    
      static DatabaseManager getInstanceOfDatabaseManager() {
        return new DatabaseManager(new RecordMapper());
    }
     public static AttendanceController getInstanceOfAttendanceController() {
        return new AttendanceController();
    }
     //ref
     public static RegController getinstanceofLoginController(){
     
     return new RegController();
     
     
     }
     public static FillProgressBar getinstanceofProgressBar(){
   
     return  new FillProgressBar();
     }

     public static updatedListFromTab getinstanceofupdaFromTab(){
   
     return  new updatedListFromTab();
     }

  
     
     
}

