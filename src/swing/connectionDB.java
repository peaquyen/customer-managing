package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
   private static Connection mysqlconfig;
    public static Connection configDB(){
        try {
            String url="jdbc:mysql://localhost:3306/guest"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("connection failed "+e.getMessage()); //command displays connection errors
        }
        return mysqlconfig;
    }     
}
