/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import static GUI.Frame.MainFrame.height;
import static GUI.Frame.MainFrame.width;
import Keyboard.KeyPos;
import Keyboard.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Imad
 */
public class GamePanel extends JPanel implements KeyListener , ActionListener
{
    private String BF = "This Is Only A Test .";
    private Keyboard keyboard = new Keyboard() ;
    private TextPanel textPanel = new TextPanel(BF); 
    private int size_BF = BF.split(" ").length;
    private int current_word = 0 ; 
    private Instant start ;
    private int firstClick ;
    private Timer t = new Timer(100, this);
    
    public GamePanel()
    {
        
        setLayout(null);
        // Init Sizes //
        keyboard.setBounds(0, height/3, width-16, height-39);
        textPanel.setBounds(0, 0, width-16, height/3);
        
        
        // Update Panels //
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        // Add Panels //
        add(textPanel);
        add(keyboard);
        
        firstClick = 0; 
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if (firstClick == 0)
        {
            start = Instant.now();
            firstClick ++ ;
            t.start();
        }
        
        int code = (int)(e.getKeyChar()) ;
        int T_Pos [] = KeyPos.getPos(code);
        keyboard.r = new Rectangle(T_Pos[0],T_Pos[1],T_Pos[2], T_Pos[3],T_Pos[4]);
        keyboard.rep();
        
        if (code < 256)
        {
            if (code != 8 )
            {
                textPanel.append(""+e.getKeyChar());
            }else
            {
                textPanel.supprime();
            }
        }
        
        textPanel.update(current_word);
        
        
        if (!textPanel.egale())
        {
            textPanel.highlight();
        }else
        {
            textPanel.update(++current_word);
            textPanel.highlight();
            textPanel.effacerTextF();
            if (!(current_word < size_BF))
            {
                JOptionPane.showMessageDialog(this, "Votre Vitesse Est : "+textPanel.getWPM(), "Terminer", 1);
                System.exit(0);
            }
        }
        
        Thread t0 = new Thread(() ->{
            try {
                Thread.sleep(50);
                keyboard.r = new Rectangle(0,0,0, 0,1);
                keyboard.rep();
            } catch (Exception ee) {
            }
        });
        t0.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Duration timeElapsed = Duration.between(start, Instant.now());
        System.out.println("Time : "+timeElapsed.toMillis());
        
        float time_second = (float)(timeElapsed.toMillis()/1000);
        float wpm ;
        
        if (time_second != 0 && (current_word < size_BF) )
        {
            wpm = (current_word)/(time_second/60) ;
            textPanel.setWPM(""+String.format("%.02f", wpm)); 
        }else
        {
            wpm = 0;
        }
        
        
    }
}
