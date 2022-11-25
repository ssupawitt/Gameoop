package javaapplication5;

import java.awt.event.*;
import javax.swing.JFrame;

public class PlayGames extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new PlayGames();
        frame.setSize(1000, 800);
        frame.setTitle("Ancient Mage");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    homegames homegames1 = new homegames();
    state state1 = new state();
    gameover gover = new gameover();

    public PlayGames() {
        this.setSize(1000, 800);
        this.add(homegames1);
        homegames1.BExit1.addActionListener(this);
        homegames1.BStart.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homegames1.BStart) {
            this.setLocationRelativeTo(null);
            this.remove(homegames1);
            this.setSize(1000, 800);
            this.add(state1);
            state1.requestFocusInWindow();
            state1.timestart = false;
            state1.scor = 0;
            state1.HP = 3;
            state1.times = 100;
            state1.startball = false;
            state1.timestart = false;
        } else if (e.getSource() == homegames1.BExit1) {
            System.exit(0);
        }
        this.validate();
        this.repaint();
    }


}
