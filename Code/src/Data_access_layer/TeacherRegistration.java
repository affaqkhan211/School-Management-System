/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//mine
package Data_access_layer;

import java.sql.*;

/**
 *
 * @author mnk
 */
public class TeacherRegistration {
   void regesterteacher(String fname,String lname, String t_id, String email,String Class,String pass,String admin_id,String query,PreparedStatement prepere) throws SQLException{
   prepere.setString(1, fname);
   prepere.setString(2, lname);
   prepere.setString(3, t_id);
   prepere.setString(4, email);
   prepere.setString(5, Class);
   prepere.setString(6, pass);
   prepere.setString(7,admin_id );
   
 
 prepere.executeUpdate();

       }
}