/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Data_access_layer.DatabaseManager;
import Data_access_layer.RecordMapper;

/**
 *
 * @author hp
 */
public class Acontroller {
    
    
      static DatabaseManager getInstanceOfDatabaseManager() {
        return new DatabaseManager(new RecordMapper());
    }
     public static AttendanceController getInstanceOfAttendanceController() {
        return new AttendanceController();
    }
}
