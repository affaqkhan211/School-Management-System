/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import Record.StudentRecord;
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
   StudentRegistration stdreg;
   TeacherRegistration threg;
   
     
    public DatabaseManager(RecordMapper mapp){
        connect=new SqlConnection("jdbc:mysql://127.0.0.1:3306/management" ,"irfan", "irfan1234");
       this.mapp=mapp;
  reader=new DatabaseReader();
   setrecord=new RecordSet();
  stdreg=new StudentRegistration();
  threg=new TeacherRegistration();
  
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
 public void insertStudentrecord(String fname,String lname, String regno, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
  Connection dbconn =connect.getConnection();
 PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
 
 stdreg.regesterStudent(fname,lname,regno, email,Class,pass,Admin_id,setQuery,prepere);
 
  }
 //techer registeration mine
 public void insertteacherrecord(String fname,String lname, String t_id, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
  Connection dbconn =connect.getConnection();
 PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
 
threg.regesterteacher(fname,lname,t_id, email,Class,pass,Admin_id,setQuery,prepere);

  }

    
   
    
    
}
