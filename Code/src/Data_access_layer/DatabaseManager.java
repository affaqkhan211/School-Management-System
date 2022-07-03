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
    
<<<<<<< HEAD
   private String Query;
=======
   private String getQuery;
   private String setQuery;
>>>>>>> parent of b49d54b (Added Code)
   
     
    public DatabaseManager(RecordMapper mapp){
        connect=new SqlConnection("jdbc:mysql://localhost:3306/attendance__system","root","kashan123");
       this.mapp=mapp;
  reader=new DatabaseReader();
<<<<<<< HEAD
=======
   setrecord=new RecordSet();
  
>>>>>>> parent of b49d54b (Added Code)
    }
            
   public void getquery(String Query){
   
   this.Query=Query;
   
   }
public ArrayList<StudentRecord> getlist(){

Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(Query,dbconn);

return mapp.getStudents(rs);

}
 
<<<<<<< HEAD
=======
        PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
 
 return prepere;
 
 }
>>>>>>> parent of b49d54b (Added Code)

    
   
    
    
}
