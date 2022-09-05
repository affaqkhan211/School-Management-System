/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.attendance_module;

import Model.Response;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ResponseHandler {

    
  public  static void handelresponse(Response response ,JComponent uiComponent){
           
        if(response.hasError()){
            
            JOptionPane.showMessageDialog(uiComponent,response.getMessages("error"),"",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
                        JOptionPane.showMessageDialog(uiComponent,response.getMessages("info"),"",JOptionPane.INFORMATION_MESSAGE);

        }
     
        
    }
    
    
    
}
