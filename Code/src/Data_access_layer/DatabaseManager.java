/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import AttendanceRecord.StudentRecord;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author hp
 */
public class DatabaseManager {
    
    DatabaseReader reader;
    RecordMapper mapp;
     Iconnection connect;
    
   private String Query;
   
     
    public DatabaseManager(RecordMapper mapp){
        connect=new SqlConnection("jdbc:mysql://localhost:3306/attendance__system","root","kashan123");
       this.mapp=mapp;
  reader=new DatabaseReader();
    }
            
   public void getquery(String Query){
   
   this.Query=Query;
   
   }
public ArrayList<StudentRecord> getlist(){

Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(Query,dbconn);

return mapp.getStudents(rs);

}
 

    
   
    
    
}
