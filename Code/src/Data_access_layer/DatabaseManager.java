/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import AttendanceRecord.StudentRecord;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author hp
 */
public class DatabaseManager {
    
    DatabaseReader reader;
    RecordMapper mapp;
     Iconnection connect;
    RecordSet setrecord;
    
   private String getQuery;
   private String setQuery;
   
     
    public DatabaseManager(RecordMapper mapp){
        connect=new SqlConnection("jdbc:mysql://localhost:3306/attendance__system","root","kashan123");
       this.mapp=mapp;
  reader=new DatabaseReader();
   setrecord=new RecordSet();
  
    }
            
   public void getquery(String getQuery){
   
   this.getQuery=getQuery;
   
   }
//   public void setquery(String setQuery){
//   
//   this.setQuery=setQuery;
//   
//   
//   }
public ArrayList<StudentRecord> getlist(){
 Connection dbconn =connect.getConnection();

ResultSet rs =reader.getRecord(getQuery,dbconn);

return mapp.getStudents(rs);

}
 public PreparedStatement insertrecord(String setQuery){
  Connection dbconn =connect.getConnection();
  
 
        PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
 
 return prepere;
 
 }

    
   
    
    
}
