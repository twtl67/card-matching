package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton play;
    private JSlider slider;

    public GUI() {
        runApp();
    }
    private void runApp() {
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card Matching Game");
        frame.add(panel);


//        panel.setLayout(new GridLayout(3, 2));
        panel.add(play = new JButton("Play game"));
        panel.add(slider = new JSlider());
        //frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
