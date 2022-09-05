////refactor name regController from Logincontroller
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import Data_access_layer.DatabaseManager;
//
//import java.sql.SQLException;
//
///**
// *
// * @author mnk
// */
//public class RegController {
//     DatabaseManager dm;
//    
//    public RegController(){
//        
//        
//         dm=ObjectsFactory.getInstanceOfDatabaseManager();
//        
//    }
//    
//    
//public  void  insert(String fname,String lname, String regno, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
//    
//    
//   dm.insertStudentrecord(fname,lname,regno, email,Class,pass,Admin_id,setQuery);
//   
//   
//   }
////mine
//public  void  insertteach(String fname,String lname, String t_id, String email,String Class,String pass,String Admin_id,String setQuery) throws SQLException{
//    
//   dm.insertteacherrecord(fname,lname,t_id, email,Class,pass,Admin_id,setQuery);
//   
//   
//   }
//public  void  insertclerk(String fname,String lname, String c_id, String email,String pass,String Admin_id,String setQuery) throws SQLException{
//    
//   dm.insertclerkrecord(fname,lname,c_id, email,pass,Admin_id,setQuery);
//}
//
//   
//}
