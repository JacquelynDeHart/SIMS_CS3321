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
import java.awt.event.*;
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
    JFrame logging = new JFrame();
    
    //panels to stuff in the frame
    JPanel login;
    
    //buttons to push in the panel
    JButton ex, log, newUsr;            //ex = exit, log = login
    JTextField IDkey;     //IDkey = admin/student ID#, pass = password
    JPasswordField pass;
    JLabel idLabel, passLabel, frameLabel;  //labels to intro textfields/ frame
    int usrID;
    String passw;
    private String OK = "ok";
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
        pass = new JPasswordField(10);
        pass.setActionCommand(OK);
        //pass.addActionListener(new passActionListener(e));
                
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
        logging.add(login, BorderLayout.CENTER);
        logging.add(ex, BorderLayout.SOUTH);
        
        
        //pack, setRelativeLocation, visibility
        logging.setTitle("Student Info Management System");
        logging.setSize(275, 275);
        logging.setVisible(true);
        logging.setLocationRelativeTo(null);
        //when default close button is selected, the project doesn't close completely
        logging.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
                    logging.setVisible(false);
                    //create frame for new user input and stuff
                    //JFrame newUsr = new JFrame("New User Information");
                    new newUsr();

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
        //passw = pass.getText();
        //testing that the text was captured
        System.out.println(usrID);
        //System.out.println(passw);
        
    }
    
    /**
     * private method to handle newUsr button click
     */
    private void newUsrMouseClicked(java.awt.event.MouseEvent ae) throws IOException{
        //JOptionPane.showMessageDialog(null, "You clicked the New User button!");
    }
    
//    public class passActionListener implements ActionListener{
//        void actionPerformed(ActionEvent e){
//            
//        }
//    }
//        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SIMS();
    }
    
}
