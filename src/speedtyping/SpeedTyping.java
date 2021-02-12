/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedtyping;

import GUI.Frame.MainFrame;
import java.time.Duration;
import java.time.Instant;
import javax.swing.SwingUtilities;

/**
 *
 * @author Imad
 */
public class SpeedTyping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
        
    }
    
}
