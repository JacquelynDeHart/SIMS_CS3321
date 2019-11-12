/**
 * This class houses the login password check, methods for adding a class to 
 * a student record, deleting a class from a student record, viewing grades for 
 * all courses, viewing enrolled classes, viewing GPA, and GPA calculation.
 */
package sims;
import javax.swing.*;
/**
 *
 * @author Jacquelyn Johnson
 */
public class Login extends JPanel{
    private String pass;
    private int stuID;
    private JPanel display;
    /**
     * constructor for the class.
     * @param a the password from the user login process
     * @param ID the ID key that identifies the user
     */
    public Login(String a, int ID){
        pass = a;
        stuID = ID;
        
        display = new JPanel();
        
    }
    
    /**
     * check password method. accepts a string variable to test for password
     * validation
     * @param a password to validate
     */
    public static boolean passCheck(char[] a){  //might need to add a param for userID
        //needs to pull password associated with the student ID from database to 
        //validate
        boolean flag = false;
        //call database and pull associated userID password to validate.
        //test it here... change flag appropriately 
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
    
//    /**
//     * calculation of GPA
//     */
//    public double calcGPA(){
//        
//    }
}
