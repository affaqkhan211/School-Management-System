/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

/**
 *
 * @author hp
 */
public class DatabaseManager {
    
    DatabaseReader reader;
    RecordMapper mapper;
     Iconnection connect;
     
    public DatabaseManager(){
        
        connect=new SqlConnection("localhost:3306","attendance_system" , "root", "kashan123");
        
        
    }
    
    
    
}
