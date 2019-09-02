/**
 * This program will accept input from an administrator of partial student 
 * records. The student's name, current courses, GPA for each course, etc will 
 * be stored in a database keyed by the unique student ID number. The student 
 * will be able to view the records that the administrator has input.
 */
package sims;

//import needed libraries for GUI
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Jacquelyn Johnson
 **/

public class SIMS extends JFrame{
    //frame for the program
    JFrame frame = new JFrame();
    
    //panels to stuff in the frame
    JPanel admin, student;
    
    //buttons to push in the panels
    JButton ad, st, ex;
    
    /**
     * constructor for the class
     */
    public SIMS(){
        //make buttons a reality
        ad = new JButton("Admin");
        st = new JButton("Student");
        ex = new JButton("Exit Program");
        
        //panel creation
        admin = new JPanel();
        student = new JPanel();
        
        //place buttons in the panels with default BorderLayout manager
        //place panels in the frame. frame has the default BorderLayout manager
        admin.add(ad, BorderLayout.NORTH);
        student.add(st, BorderLayout.NORTH);
        add(admin, BorderLayout.WEST);
        add(student, BorderLayout.EAST);
        add(ex, BorderLayout.SOUTH);
        
        //pack, setRelativeLocation, visibility
        setTitle("Student Info Management System");
        setSize(620, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SIMS();
    }
    
}
