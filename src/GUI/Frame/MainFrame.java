/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Frame;

import GUI.Panel.GamePanel;
import GUI.Panel.Keyboard;
import GUI.Panel.TextPanel;
import Keyboard.KeyPos;
import Keyboard.Rectangle;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Imad
 */
public class MainFrame extends JFrame 
{
    public static final int width = Toolkit.getDefaultToolkit().getScreenSize().width *9/10;
    public static final int height = Toolkit.getDefaultToolkit().getScreenSize().height *9/10;
    
    private GamePanel game = new  GamePanel(); 
    
    public MainFrame()
    {
        setTitle("WPM");
	setResizable(false);
        setSize(width,height);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-width)/2,
                    (Toolkit.getDefaultToolkit().getScreenSize().height-height)/2);
        setLayout(new BorderLayout());
        add(game,BorderLayout.CENTER);
    }
}
