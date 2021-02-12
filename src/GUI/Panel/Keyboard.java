/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import GUI.Frame.MainFrame;
import Keyboard.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Imad
 */
public class Keyboard extends JPanel  {
    
    private BufferedImage img ;
    public Rectangle r = null ;
    
    public Keyboard()
    {
        setBackground(Color.red);
        try {
            img = ImageIO.read(new File("./res/keyboard.png"));
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,MainFrame.width-16,MainFrame.height-MainFrame.height/3-39,null);
        if (r != null)
        {
            switch (r.getColor())
            {
                case 1 :
                    g.setColor(Color.cyan);
                    break ;
                case 2 :
                    g.setColor(Color.red);
                    break ;
                case 3 :
                    g.setColor(Color.green);
                    break ;
            }
            g.drawRect(r.getX(), r.getY(),r.getW(), r.getH());
            g.drawRect(r.getX()+1, r.getY()+1,(r.getW()-2), (r.getH())-2);
            g.drawRect(r.getX()+2, r.getY()+2,(r.getW()-4), (r.getH())-4);
            g.drawRect(r.getX()+3, r.getY()+3,(r.getW()-6), (r.getH())-6);
        }
    };

   
    
    public void rep()
    {
        repaint();
    }

    
}
