package travel.management.system;

import java.sql.*;  

public class Conn {
    Connection c;
    Statement s;
    public Conn() {  
        try {  
            // Ensure the JDBC driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");  
            
            // Correct the connection URL
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "snehal@10654"); 
            
            // Create a Statement object for sending SQL statements to the database
            s = c.createStatement();  
            
        } catch(Exception e) { 
            System.out.println(e);
        }  
    }  
}
