package ui;

import model.PhotoCard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton play;
    private JSlider slider;

    private PhotoCard ethan;
    private PhotoCard winnie;
    private PhotoCard amy;
    private PhotoCard jubelle;
    private PhotoCard terry;
    private PhotoCard polina;
    private PhotoCard kevin;
    private PhotoCard jason;




    public GUI() {
        runApp();
    }

    private void runApp() {
        initCards();
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card Matching Game");
        frame.add(panel);


//        panel.setLayout(new GridLayout(3, 2));
        panel.add(play = new JButton("Play game"));
        panel.add(slider = new JSlider());
        ImageIcon icon = new ImageIcon(ethan.photo_path);
        panel.add(new JButton(icon));
            //frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void initCards() {
        ethan = new PhotoCard("Ethan","src/main/ui/stickman.jpg");
        winnie = new PhotoCard("Winnie","src/main/ui/stickman.jpg");
        amy = new PhotoCard("Amy","src/main/ui/stickman.jpg");
        jubelle = new PhotoCard("Jubelle","src/main/ui/stickman.jpg");
        terry = new PhotoCard("Terry","src/main/ui/stickman.jpg");
        polina = new PhotoCard("Polina","src/main/ui/stickman.jpg");
        kevin = new PhotoCard("Kevin","src/main/ui/stickman.jpg");
        jason = new PhotoCard("Jason","src/main/ui/stickman.jpg");
    }
}
