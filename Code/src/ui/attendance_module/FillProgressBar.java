/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.attendance_module;

import Record.StudentRecord;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;



/**
 *
 * @author hp
 *

 */
public class FillProgressBar{


    
   public  void fill(JProgressBar jpresent,JProgressBar jabsent,ArrayList<StudentRecord> stdlist){
       
     int total= stdlist.size();
     
     if(total==0){
    
         
         return;
     }
       int present=0;
       int absent=0;
     
       
       for (StudentRecord std:stdlist){
       if(std.attendance.equals("present"))
       present++;
       else
           absent++;
       }
       
       int pper=  present*100/total;
      int aper=absent*100/total;
       
       

int pcounter=0;

       while (pcounter<=pper) {
              jpresent.setValue(pcounter);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TeacherViewAttendace.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                pcounter+=15;
                
       }
  int acounter=0;
  jabsent.setValue(0);
                while (acounter<=aper) {
              jabsent.setValue(acounter);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TeacherViewAttendace.class.getName()).log(Level.SEVERE, null, ex);
                }
               acounter+=15;
            }
   
    
    }
    
}
