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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jacquelyn Johnson
 **/

public class SIMS extends JFrame{
    //frame for the program
    JFrame frame = new JFrame();
    
    //panels to stuff in the frame
    JPanel login;
    
    //buttons to push in the panel
    JButton ex, log, newUsr;            //ex = exit, log = login
    JTextField IDkey, pass;     //IDkey = admin/student ID#, pass = password
    JLabel idLabel, passLabel, frameLabel;  //labels to intro textfields/ frame
    int usrID;
    String passw;
    /**
     * constructor for the class
     */
    public SIMS(){
        //make buttons a reality
        ex = new JButton("Exit Program");
        log = new JButton("Login");
        newUsr = new JButton("Create New User");
        
        //give text field some body
        IDkey = new JTextField(10);
        pass = new JTextField(10);
        
        //finalize label instantiation
        frameLabel = new JLabel("Welcome to the login page:");
        idLabel = new JLabel("Institution ID#");
        passLabel = new JLabel("User password");
        
        //panel creation
        login = new JPanel();
        
        //place buttons in the panels with default BorderLayout manager
        //place panels in the frame. frame has the default BorderLayout manager
        login.add(frameLabel, BorderLayout.NORTH);
        login.add(idLabel, BorderLayout.CENTER);
        login.add(IDkey, BorderLayout.CENTER);
        login.add(passLabel, BorderLayout.CENTER);
        login.add(pass, BorderLayout.CENTER);
        login.add(log, BorderLayout.CENTER);
        login.add(newUsr, BorderLayout.SOUTH);
        add(login, BorderLayout.CENTER);
        add(ex, BorderLayout.SOUTH);
        
        //pack, setRelativeLocation, visibility
        setTitle("Student Info Management System");
        setSize(275, 275);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add functionality to exit button
        ex.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                try {
                    quitMouseClicked(ae);
                } catch (IOException ex) {
                    
                }
            }

        });
        
        //add function to login button click
        log.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                try{
                    logMouseClicked(ae);
                } catch (IOException ex){
                    
                }
            }
        });
        
        //add function to newUsr button click
        newUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                try{
                    newUsrMouseClicked(ae);
                    //String usr = (String) JOptionPane.showInputDialog(
                    //);

                } catch (IOException ex){
                    
                }
            }
        });
    }
    /**
     * private method to handle the quit button click
     */
    private void quitMouseClicked(java.awt.event.MouseEvent ae) throws IOException{
        System.exit(0);
    }
    /**
     * private method to handle login button click
     */
    private void logMouseClicked(java.awt.event.MouseEvent ae) throws IOException{
        //JOptionPane.showMessageDialog(null, "You clicked the Login button!");
        String usrIdInput = IDkey.getText();
        //validation for usrID to be only integers
        usrID = Integer.parseInt(usrIdInput);
        passw = pass.getText();
    }
    
    /**
     * private method to handle newUsr button click
     */
    private void newUsrMouseClicked(java.awt.event.MouseEvent ae) throws IOException{
        //JOptionPane.showMessageDialog(null, "You clicked the New User button!");
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SIMS();
    }
    
}
