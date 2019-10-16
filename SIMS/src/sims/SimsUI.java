/**
 * This class provides all the UI interface needs
 */
package sims;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
/**
 *
 * @author Jacquelyn Johnson
 */
public class SimsUI extends JFrame{
    JFrame ui = new JFrame();
    
    /**
     * no argument constructor
     */
    public SimsUI(){
        //makeFullScreen(ui);
        makeHalfScreen(ui);
        ui.setTitle("New Frame");
    }
    
    
    /**
     * sets the frame size to the whole screen of the user
     * @param aF is the frame to be sized accordingly
     */
    private void makeFullScreen(JFrame aF){
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            aF.setSize(screenSize);
        }
    
    /**
     * sets the frame size to that of half the size of the screen of the user
     * @param aF frame to be sized to half the screensize
     */
    private void makeHalfScreen(JFrame aF){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        aF.setSize((screenSize.width)/2, (screenSize.height)/2);
    }
}
