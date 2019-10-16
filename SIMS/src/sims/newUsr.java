/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.IOException;

/**
 *
 * @author Jacquelyn Johnson
 */
public class newUsr extends JFrame{
    public int bp;      //bp is the user defined admin or student profile to create
    JFrame ui = new JFrame();
    JPanel disp = new JPanel();
    private final String[] profSelect = {"Student","Administrator"};
    JComboBox profile = new JComboBox(profSelect);
    JTextField showID = new JTextField(10);
    JPasswordField adminCheck = new JPasswordField(4);
    JButton quit, submit;
    JPanel grid = new JPanel();
    int newID;
    String newPass; //needs to be setup
    
    /**
     * no argument constructor for the class
     */
    public newUsr(){
        makeHalfScreen(ui);
        quit = new JButton("Cancel");
        submit = new JButton("Submit");
        showID.setEditable(false);
        grid.setLayout(new GridLayout(0,2));
        disp.add(profile, BorderLayout.WEST);
        disp.add(showID, BorderLayout.CENTER);
        grid.add(quit); grid.add(submit);
        
        ui.add(disp, BorderLayout.WEST);
        ui.add(grid, BorderLayout.SOUTH);
        
        //ui.add(submit, BorderLayout.SOUTH);
        
        ui.setTitle("Create New User Profile");
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
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
    }
    
    public newUsr(int a){
        bp = a;
        
    }
    
    /**
     * sets the frame size to that of half the size of the screen of the user
     * @param aF frame to be sized to half the screenSize
     */
    private void makeHalfScreen(JFrame aF){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        aF.setSize((screenSize.width)/2, (screenSize.height)/2);
    }
    
    /**
     * method for cancel button click
     */
    private void quitMouseClicked(java.awt.event.MouseEvent ae){
        new SIMS();
    }
    
    /**
     * method for submit mouse click
     */
    private void submitMouseClicked(java.awt.event.MouseEvent ae){
        //capture all the information from user input and feed it to the database here
        
        //after it's sent to the database, refactor and return to the login option
    }
    
    /**
     * method for generating a new ID. will pull last ID entry from the database,
     * add 1 to the last digit, and return it as the newID for the newUsr
     * @return the new ID number for the user and display it in the showID JTextField
     */
    public int newIDGen(){
        //pull the last ID entry from the database
        newID = 10000001 +1;
        return newID;
    }
}
