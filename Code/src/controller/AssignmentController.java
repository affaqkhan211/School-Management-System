/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Data_access_layer.DatabaseManager;
import Model.Response;
import Record.AssignmentRecord;

/**
 *
 * @author hp
 */

public class AssignmentController {
    DatabaseManager dm;

    public AssignmentController(){
     dm=ObjectsFactory.getInstanceOfDatabaseManager();
    }
    
    public Response CUploadAssignment(AssignmentRecord record){
    
        Response response =new Response();
        
        dm.UploadAssignment(record,response);
        
        
        return response;
        
    
    }

  
}
