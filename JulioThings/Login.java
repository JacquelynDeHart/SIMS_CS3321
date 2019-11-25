package fetch;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;


public class Login extends JPanel {
	
   private String pass;
   private int stuID;
   private JPanel display;
   
   
 
   public Login(String a, int ID) {
       pass = a;
       stuID = ID;
       display = new JPanel(); 
       
   }
   
   /**
    * check password method. accepts a string variable to test for password
    * validation
    * @param a password to validate
    */
   public static boolean passCheck(char[] a, int ID)  {  //might need to add a param for userID
       //needs to pull password associated with the student ID from database to 
       //validate
       boolean flag = false;
       
       int id = ID;
       char [] passw = a;
       
       String passString = new String (passw);
       
       Connection conn = null;
       Statement stmt = null;
       try{

          //STEP 3: Open a connection
          System.out.println("Connecting to a selected database...");
          conn = Db.java_db();
     
 
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
        	 
        	 JOptionPane.showMessageDialog(null, "Succes! Your student id and password are valid");
        	 flag = true; 
        	//call database and pull associated userID password to validate.
             //test it here... change flag appropriately 
             
         	} else {
         		JOptionPane.showMessageDialog(null, "Invalid id or password");
         }
        
         } // WHILE LOOP
          
          rs.close();
       } catch (Exception e){
           
    	   JOptionPane.showMessageDialog(null, "Invalid id or password");
       	}
       
      
       return flag;
       
   }
   
   /**
    * add a class method
    */
   public void addClass(){
       //make JComboBox here with courses to select from. Consider using an ArrayList
       //or a LinkedList for the courses
   }
   
   /**
    * delete a class method
    */
   public void delClass(){
       //same as above, except the course population will be from the database table
       // data that is associated with this user
   }
   
   /**
    * view enrolled class method
    */
   public void viewClasses(){
       //automatically display the classes that the student is enrolled in once
       //they actually enroll in them. place in the panel in a nonEditable JTextBox 
       //or something along those lines. Maybe consider having the database somehow
       //output their associated values here
   }
   
   /**
    * view grades for all courses enrolled
    */
   public void viewGrades(){
       //maybe consider combining this method with above
   }
   
   /**
    * view GPA
    */
   public void showGPA(){
       //add the grades together for a specific student and divide by the number
       //of classes that they have taken.
   }
   
//   /**
//    * calculation of GPA
//    */
//   public double calcGPA(){
//       
//   }
}
