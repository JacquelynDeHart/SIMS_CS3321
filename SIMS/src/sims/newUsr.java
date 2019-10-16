/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jacquelyn Johnson
 */
public class newUsr extends JFrame{
    public int bp;      //bp is the user defined admin or student profile to create
    JFrame ui = new JFrame();
    JPanel disp = new JPanel();
    JComboBox profile = new JComboBox();
    JTextField showID = new JTextField(10);
    JPasswordField adminCheck = new JPasswordField(4);
    JButton quit = new JButton("Cancel");
    
    /**
     * no argument constructor for the class
     */
    public newUsr(){
        makeHalfScreen(ui);
        ui.setTitle("Create New User Profile");
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        showID.setEditable(false);
        
        disp.add(profile, BorderLayout.WEST);
        disp.add(showID, BorderLayout.CENTER);
        
        ui.add(disp, BorderLayout.WEST);
        ui.add(quit, BorderLayout.SOUTH);
        
    }
    
    public newUsr(int a){
        bp = a;
        
    }
    
    /**
     * sets the frame size to that of half the size of the screen of the user
     * @param aF frame to be sized to half the screensize
     */
    private void makeHalfScreen(JFrame aF){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        aF.setSize((screenSize.width)/2, (screenSize.height)/2);
    }
    
    /**
     * private method to handle quit button click. will dispose the frame and freeze 
     * anything associated with it.
     */
    
}
