/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;

import Model.Response;
import Record.AssignmentRecord;
import Record.StudentAttendanceRecord;
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
    StudentAddAttendance addatt;

    ClerkRegistration clreg;
       
UploadAssignment uploadAssignment;

    
     UpdateStudentAttendance updatt;
     

    public DatabaseManager(RecordMapper mapp){
//        connect=new SqlConnection("jdbc:mysql://127.0.0.1:3306/management" ,"irfan", "irfan1234");
  connect=new SqlConnection("jdbc:mysql://localhost:3306/attendance__system" ,"root", "kashan123");
       this.mapp=mapp;
  reader=new DatabaseReader();
   setrecord=new RecordSet();
  stdreg=new StudentRegistration();
  threg=new TeacherRegistration();
  addatt=new StudentAddAttendance();

  clreg=new ClerkRegistration();

  updatt=new UpdateStudentAttendance();
uploadAssignment=new UploadAssignment();

  
    }
            

public ArrayList<StudentRecord> getlist(String query){
    
   
 Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(query,dbconn);
return mapp.getStudents(rs);
}
// public PreparedStatement insertrecord(String setQuery){
//  Connection dbconn =connect.getConnection();
//   PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
// return prepere;
// }
 
// public void insertStudentrecord(String fname,String lname, String regno, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
//  Connection dbconn =connect.getConnection();
// PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
// 
// stdreg.regesterStudent(fname,lname,regno, email,Class,pass,Admin_id,setQuery,prepere);
// 
//  }
 //techer registeration mine
// public void insertteacherrecord(String fname,String lname, String t_id, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
//  Connection dbconn =connect.getConnection();
// PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
//threg.regesterteacher(fname,lname,t_id, email,Class,pass,Admin_id,setQuery,prepere);
//
//  }

    public void  insertattendance(ArrayList<StudentAttendanceRecord> setstdList,Response response){
        String query="insert into attendance (teacher_id,reg_num,att_status,_date) values (?,?,?,?)";
        Connection dbconn =connect.getConnection();
        PreparedStatement prepere = setrecord.setRecord(query,dbconn,response);
         addatt.AddAttendance(prepere,setstdList,response);
  
    }

//    public void insertclerkrecord(String fname, String lname, String c_id, String email, String pass, String Admin_id, String setQuery) throws SQLException {
//        Connection dbconn =connect.getConnection();
// PreparedStatement prepere = setrecord.setRecord(setQuery,dbconn);
//clreg.regesterclerk(fname,lname,c_id, email,pass,Admin_id,setQuery,prepere);
//    }
//    
    public void  insertUpdAtt(ArrayList<StudentAttendanceRecord> setstdList,String date,Response reponse) throws SQLException{
        Connection dbconn =connect.getConnection();
        String query="update attendance SET att_status=?  where reg_num=?  AND _date="+"'"+date+"'";
        PreparedStatement prepere = setrecord.setRecord(query,dbconn,reponse);
    
    updatt.updAtt(prepere,setstdList,reponse);
    
    }
    public ArrayList<StudentRecord> teacherviewattendance() {
        
         String query="select * from studentatt";
        return getlist(query);
    }
    public ArrayList<StudentRecord> studentlist() {
        String query="select distinct * from students";
        return getlist(query);
    }
    public ArrayList<StudentRecord> modifyAttendanceList(String date) {
         String query="select * from studentatt where _date="+"'"+date+"'";
        return getlist(query);
    }
     public ArrayList<StudentRecord> studentviewlist(String regnum) {
          String query="select * from studentatt where reg_num="+"'"+regnum+"'";
        return getlist(query);
     }
       public ArrayList<StudentRecord> adminviewlist(String Class){
             String Query="select * from studentatt where class="+"'"+Class+"'";
    return getlist(Query);
       }

    public void UploadAssignment(AssignmentRecord record, Response response) {

     String Query="insert into Assignment(Assignment_num,url,t_id,date) values(?,?,?,?)";
  Connection dbconn =connect.getConnection();
     PreparedStatement prepere = setrecord.setRecord(Query,dbconn,response);
     
     uploadAssignment.UploadAssi(prepere, record, response);
     
    }
    
}
