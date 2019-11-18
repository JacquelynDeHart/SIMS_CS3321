package sims;

//Import required packages
import java.sql.*;

import java.sql.*;
import javax.swing.*;

public class Db {
    
     // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/info";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "vermilion171190";       //vermilion171190
   
   
   public static Connection java_db(){
   
   Connection conn = null;
        
        try{ 
        	
           Class.forName("com.mysql.jdbc.Driver");
           
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           
          // JOptionPane.showMessageDialog(null, "Connection to database is successful");
           
           System.out.println("Connected database successfully...");
           
            return conn;
           
             
        } catch (Exception e){
            //JOptionPane.showMessageDialog(null, "Could not connect to database");
            System.out.println("Could not connect to database");
            
            return null;
        }
   
   }
  
   
}
