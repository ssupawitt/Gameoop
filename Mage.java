package javaapplication5;

import javax.swing.ImageIcon;


public class Mage {
    public ImageIcon[] im = new ImageIcon[7];
    public int x;
    public int count = 0;
    Mage(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));
	}
    }
}
