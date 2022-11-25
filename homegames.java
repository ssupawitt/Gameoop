package javaapplication5;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.net.URL;

import javax.swing.*;


public class homegames extends JPanel{
    private ImageIcon feild = new ImageIcon(this.getClass().getResource("eezy_61-01.jpg"));
	private ImageIcon exit = new ImageIcon(this.getClass().getResource("wood3.jpg"));
	private ImageIcon starts = new ImageIcon(this.getClass().getResource("wood2.jpg"));
	public JButton BStart = new JButton(starts);
	public JButton BExit1  = new JButton(exit);
	homegames(){
            setLayout(null);
            BExit1.setBounds(420, 500, 170,90);
            add(BExit1);
            add(BStart);
            BStart.setBounds(420,350,170,90);
            add(BStart);
	}
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(feild.getImage(),0,0,1000,800,this);
            g.setColor(Color.MAGENTA);
            g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,90));
            g.drawString("Ancient Mage",220,200);

	}
}