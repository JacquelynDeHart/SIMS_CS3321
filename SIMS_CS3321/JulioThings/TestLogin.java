package fetch;

import java.util.Scanner;
import java.sql.*;


public class TestLogin {
    
   
   public static void main(String[] args) {
  
   
   try{
	   
	   Connection conn = null;
	   Statement stmt = null;

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = Db.java_db();
      System.out.println("Connected database successfully...");
      
      int id = 1;
      char [] passw = {'1','1','1'};
      
      String passString = new String (passw);
      
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "SELECT student_id, password FROM student_info WHERE student_id = " + id + " AND password = " + passString;
      ResultSet rs = stmt.executeQuery(sql);
      
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int student_id  = rs.getInt("student_id");
         String password = rs.getString("password");
  
             
     if  ((student_id == id) & (password.equals(passString))) {
    	 
    	 System.out.println("Succes! Your student id and password are valid");
    	//Display values
         System.out.print("ID: " + student_id);
         System.out.println(", Password: " + password);
         
     	} else {
    	 System.out.println("Invalid ID or password");
     }
     
     System.out.println("hello?");
    
     } // WHILE LOOP
      rs.close();
   } catch (Exception e){
       //JOptionPane.showMessageDialog(null, "Could not connect to database");
       System.out.println("Could not connect to database");
   	}
  }//end main
}//end JDBCExample