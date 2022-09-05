/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Mukhtiar-HPC
 */
public class Response {
    public ArrayList<Message> messagesList;
    public Response(){ 
        messagesList = new ArrayList<>();
    }

    public boolean hasError() {
        for(Message m : messagesList)
        {
            if(m.Type == MessageType.Error || m.Type == MessageType.Exception)
                return true;
        }
        return false;
}

    public String getMessages(String type) {
        StringBuilder error = new StringBuilder();    
        StringBuilder exception =new StringBuilder();
        StringBuilder info =new StringBuilder();
     
        
        for(Message m : messagesList)
        {
         
            if(m.Type == MessageType.Error  ){
                error.append(m.Message).append("\n");
            
                
        }
        else if(m.Type==MessageType.Exception){
                
                exception.append(m.Message).append("\n");
                
                }
            else
            info.append(m.Message).append("\n");
           
    }
        if(type.equals("error"))
        return error.toString();
        else if(type.equals("exception"))
        return exception.toString();
        else
            return info.toString();
        
      
          
    }
//    public String  getinfoMessages(){
//        StringBuilder sb =new StringBuilder();
//        for(Message m :messagesList){
//            
//            if(m.Type!=MessageType.Error ||m.Type!=MessageType.Exception){
//                
//                sb.append(m.Message+"/n");
//                
//            }
//        }
//        return sb.toString();
//        
//    }

    public boolean isSuccessfull() {
        return !hasError();
    }
}
