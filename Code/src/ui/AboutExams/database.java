/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AboutExams;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author worldwide
 */
public class database {
    static int ClassNumber;
    static String Assignment;
    static String StartTime;
    static String EndTime;
    static String Note;
    static String Subject;
    
    public database(int a, String b, String c,String d,String e, String f){
        ClassNumber = a;
        Assignment = b;
        StartTime = c;
        EndTime = d;
        Note = e;
        Subject = f;
    }
    
    public static void main(String[]args){
        try {  
            Class.forName("com.aboutexams.jdbc.Driver");
            Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/aboutexamsdb","root","COM12345SATS");
            Statement st=con.createStatement();  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
