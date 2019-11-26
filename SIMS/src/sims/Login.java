/**
 * This class holds the methods for performing password validation, 
 * GPA calculation, adding, and deleting courses. It is called from 
 * mainFrame and AdminFrame.
 */
package sims;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;


public class Login {
	
   private String pass;
   private int stuID; 
   
 
   public Login(String a, int ID) {
       pass = a;
       stuID = ID;
      
       
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
       
       
       // ***************************************************************//
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
        	 //JOptionPane.showMessageDialog(null, "Succes! Your student id and password are valid");
        	 flag = true;             
            } 
         else {
         		JOptionPane.showMessageDialog(null, "Invalid id or password");
            }
        
         } // WHILE LOOP
          
          rs.close();
        } catch (Exception e){
           //JOptionPane.showMessageDialog(null, "Could not connect to database");
    	   JOptionPane.showMessageDialog(null, "Invalid id or password");
       	}
       
       // ***************************************************************//
       return flag;
       
   }
   
   /**
    * This method will take parameters passed to it for the student ID and the course ID
    * and add the course to the database and associate it with the student's record.
    * @param s  the student ID 
    * @param c  the course number
    */
   public static void addClass(int s, int c){
       try{
           Connection conn = Db.java_db();
           Statement stmt = conn.createStatement();
           
           
       }catch(Exception e){
           System.out.println(e);
       }
       
   }
   
   /**
    * delete a class method
    */
   public void delClass(){
       //same as above, except the course population will be from the database table
       // data that is associated with this user
   }
   
   /**
    * this method will accept passed values and add/change grades in the database
    * for the selected student based on the course and assignment.
    * @param sdi    the value for the student_id
    * @param cID    the value for the course_id
    * @param asgn   the String containing either exam_one or final_exam exactly
    * @param gr     the value of the grade to be added or changed.
    */
   public static void addGrades(int sdi, int cID, String asgn, int gr){
       int studentID = sdi;
       int courseID = cID;
       String asmt = asgn;
       int grade = gr;
       Connection conn = Db.java_db();
       
      String sql = " UPDATE courses " + "SET "+ asmt + " = ? " + " WHERE student_id = " + studentID + " AND course_id = " + courseID;
       
       
      try { 
       PreparedStatement statement = conn.prepareStatement(sql);
       
       statement.setInt(1, grade);
       
       int rowsUpdated = statement.executeUpdate();
       
       if (rowsUpdated > 0) {
           System.out.println("An existing user was updated successfully!");
       }
       
      } catch (SQLException ex) {
    	    System.out.println(ex);
      }
   }
   
   /**
    * view GPA
    */
   public static String showGPA(int id){
       //add the grades together for a specific student and divide by the number
       //of classes that they have taken.
       String gpa = null;
         try{
        	 
        	 Connection conn = null;
             Statement stmt = null;
             
             conn = Db.java_db();
   
            stmt = conn.createStatement();
            
            String sql = "SELECT sum(exam_one  + final_exam)/6 AS GPA "
            		+ "FROM courses "
            		+ "WHERE student_id =" + id;
            
            ResultSet rs = stmt.executeQuery(sql);
    
            while(rs.next()){
               //Retrieve by column name
              gpa  = rs.getString("GPA");
           
           } // WHILE LOOP
       
            
            rs.close();
          } catch (Exception e){
             //JOptionPane.showMessageDialog(null, "Could not connect to database");
      	   System.out.println(e);
      	   
      	
         	}
         try {
          
          float realGpa = Float.parseFloat(gpa);
          
         if(realGpa >= 93) {
        	 gpa = "4.0";
         }
         else if (realGpa >= 92 & realGpa <= 92 ){
        	 gpa = "3.7";
         }
         else if (realGpa >= 87 & realGpa <= 89 ){
        	 gpa = "3.3";
         }
         else if (realGpa >= 83 & realGpa <= 86 ){
        	 gpa = "3.0";
         }
         else if (realGpa >= 80 & realGpa <= 92 ){
        	 gpa = "2.7";
         }
         else if (realGpa >= 77 & realGpa <= 79 ){
        	 gpa = "2.3";
         }
         else if (realGpa >= 73 & realGpa <= 76 ){
        	 gpa = "2.0";
         }
         else if (realGpa >= 70 & realGpa <= 72 ){
        	 gpa = "1.7";
         }
         else if (realGpa >= 67 & realGpa <= 69 ){
        	 gpa = "1.3";
         }
         else if (realGpa >= 65 & realGpa <= 66 ){
        	 gpa = "1.0";
         }
         else {
        	 gpa = ">1";
         }
 
         }catch(Exception e) {
        	 System.out.println(e);
         }
         return gpa;
   }
   
//   /**
//    * calculation of GPA
//    */
//   public double calcGPA(){
//       
//   }
}
