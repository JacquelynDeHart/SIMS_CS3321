/**
 * This class creates the panels for adding a new user and houses the functions and 
 * methods to gather all the information from the new user with which to
 * populate the database.
 */
package sims;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jacquelyn Johnson
 */
public class newUsr extends JPanel{
    JPanel disp = new JPanel();
    JPanel grid = new JPanel();
    JLabel passwordIn;
    JButton quit, submit, cont;
    private final String[] profSelect = {"Student","Administrator"};
    JComboBox profile = new JComboBox(profSelect);
    JTextField showID = new JTextField(10);
    JTextField newPassw = new JTextField(12);
    
    int newID; private final int pin = 7951;
    String newPass;
    
    /**
     * no argument constructor for the class.
     */
    public newUsr(){
        //assign parameters to instantiated variables
        quit = new JButton("Cancel");
        submit = new JButton("Submit");
        cont = new JButton("Continue");
        showID.setEditable(false);
        passwordIn = new JLabel("Enter a password up to 12 digits:");
        
//        disp.add(profile, BorderLayout.WEST);
//        disp.add(showID, BorderLayout.CENTER);
//        disp.add(passwordIn, BorderLayout.CENTER);
//        disp.add(newPassw, BorderLayout.CENTER);
//        disp.add(cont, BorderLayout.EAST);
        
        disp.add(profile);
        disp.add(showID);
        disp.add(passwordIn);
        disp.add(newPassw);
        disp.add(cont);
        
        grid.setLayout(new GridLayout(0,2));
        grid.add(quit); grid.add(submit);
        
        add(disp);
        add(grid);
        
        quit.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                quitMouseClicked(ae);
            }
        });
        
        submit.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                submitMouseClicked(ae);
            }
        });
        cont.addMouseListener(new java.awt.event.MouseAdapter (){
           @Override
           public void mouseClicked(java.awt.event.MouseEvent ae){
               contMouseClicked(ae);
           }
        });
    }
    
    /**
     * method for cancel button click.
     */
    private void quitMouseClicked(java.awt.event.MouseEvent ae){
//figure out how to return control to the JFrame from here        
//new SIMS();
    }
    
    /**
     * method for submit mouse click.
     */
    private void submitMouseClicked(java.awt.event.MouseEvent ae){
        //capture all the information from user input and feed it to the database here
        
        //after it's sent to the database, refactor and return to the login panel
    }
    /**
     *method for contMouseClicked. Will ask the user if they want to add courses
     * now. If yes, calls a method that will connect to the LinkedList of the 
     * courses and allow courses to be added one at a time
     */
    private void contMouseClicked(java.awt.event.MouseEvent ae){
        String text = (String)profile.getSelectedItem();
        if(text == "Administrator"){
            pinValidate();  //validate clearance for creating a admin profile
            
        }       
    }
    
    /**
     * method for generating a new ID. will pull last ID entry from the database,
     * add 1 to the last digit, and return it as the newID for the newUsr
     * @return the new ID number for the user and display it in the showID JTextField
     */
    public int newIDGen(){
        //pull the last ID entry from the database
        //newID = 10000001 +1;  //only here to demonstrate the incrementation
                                //for the variable
        return newID;
    }
    
    /**
     * overloaded method for administrator ID creation. will be called only from
     * the pinValidate method
     * @param i the key code for the database selection to create an Administrator ID
     */
    private int newIDGen(int i){
        //newID = 20000001 +1;      //same as above
        return newID;
    }
    
    /**
     * this method will validate a pin if the "Administrator" option is chosen
     * by displaying a JOptionPane which will accept the pin input and compare
     * it to a private final variable that is hard coded in the program.
     */
    private void pinValidate(){
        String input = JOptionPane.showInputDialog("Please Enter the 4-digit"
        +" pin\n to validate Administrator profile creation");
        //run input validation here...............
        int count = 0;
        while(count<4){
            int pinCheck = Integer.parseInt(input);
            if(pinCheck!= pin){
                input = JOptionPane.showInputDialog("Enter the correct pin.\n"
                +" You have "+(4-count)+" tries left"); count++;
            }else{
                //generate an Administrator profile ID
                newIDGen(1); break;
            }
            
        }
    }
}
////
////    /**
////     * sets the frame size to that of half the size of the screen of the user
////     * @param aF frame to be sized to half the screenSize
////     */
////    private void makeHalfScreen(JFrame aF){
////        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
////        aF.setSize((screenSize.width)/2, (screenSize.height)/2);
////    }
////    