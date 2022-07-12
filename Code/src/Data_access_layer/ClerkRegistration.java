package Data_access_layer;
import java.sql.*;

public class ClerkRegistration {
     void regesterclerk(String fname,String lname, String c_id, String email,String pass,String admin_id,String query,PreparedStatement prepere) throws SQLException{
   prepere.setString(1, fname);
   prepere.setString(2, lname);
   prepere.setString(3, c_id);
   prepere.setString(4, email);
   prepere.setString(5, pass);
   prepere.setString(6,admin_id );
 prepere.executeUpdate();

       }
}

