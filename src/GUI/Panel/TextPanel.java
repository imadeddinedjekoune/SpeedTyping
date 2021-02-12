/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author Imad
 */
public class TextPanel extends JPanel 
{
    private JTextArea text ;
    private JTextField textF ;
    private JLabel wpm ;
    
    private int count = 0 , offset = 0;
    
    public TextPanel(String BT)
    {
        Font font = new Font("Verdana", Font.BOLD, 20);
        
        wpm = new JLabel("0 WPM");
        wpm.setOpaque(true);
        wpm.setBorder(BorderFactory.createEmptyBorder(100, 50, 10, 50));
        wpm.setBackground(new Color(245,222,179));
        wpm.setFont(font);
        
        
        textF = new JTextField();
        textF.setEditable(false);
        
        JScrollPane sp2 = new JScrollPane(textF);
        sp2.setBorder(BorderFactory.createEmptyBorder(1, 100, 1, 100));
        sp2.setBackground(new Color(245,222,179));
        
        text = new JTextArea(BT);
        text.setEditable(false);
        
        text.setFont(font);
        text.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textF.setFont(font);
        
        
        setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(text);
        sp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sp.setBackground(new Color(245,222,179));
        
        add(sp,BorderLayout.CENTER);
        add(sp2,BorderLayout.SOUTH);
        add(wpm,BorderLayout.EAST);
        
    }
    
    public void append (String text)
    {
        String Buff = this.textF.getText();
        this.textF.setText(Buff+text);
    }
    
    public void supprime()
    {
        try {
            String Buff = textF.getText();
            textF.setText(Buff.substring(0,Buff.length()-1));
        } catch (Exception e) {
        }
    }
    
    public void update(int wordPos)
    {
        int i ;
        String buff[] = text.getText().split(" ");
        count = 0 ;
        for ( i = 0 ; i < wordPos ; i++)
        {
            count += buff[i].length() + 1 ;
        }
        try {
            offset = count + buff[i].length();
        } catch (Exception e) {
        }
    }
    
    public void highlight ()
    {
        DefaultHighlighter.DefaultHighlightPainter cyanPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.green);
        try {
            text.getHighlighter().removeAllHighlights();
            text.getHighlighter().addHighlight(count, offset, cyanPainter);
        } catch (Exception e) {
        }
    }
    
    
    
    public String getTextF()
    {
        return textF.getText();
    }
    
    public boolean egale ()
    {
        String text_Word = text.getText().substring(count,offset);
        String textF_Word = textF.getText();
        
        if (textF.getText().equals("."))
        {
            return textF_Word.equals(text_Word);
        }
        
        return textF_Word.equals(text_Word+" ");
    }
    
    public void effacerTextF()
    {
        textF.setText("");
    }
    
    public void setWPM (String t)
    {
        wpm.setText(t+" WPM");
    }
    
    public String getWPM ()
    {
        return wpm.getText();
    }
    
}
