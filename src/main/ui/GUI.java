package ui;

import model.NameCard;
import model.PhotoCard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JPanel left;
    private JPanel right;
    private JButton play;
    private JSlider slider;

    //when selecting the pair of cards in game
    private NameCard selectedName;
    private PhotoCard selectedPhoto;
    private int selected = 0;

    private PhotoCard ethan;
    private PhotoCard winnie;
    private PhotoCard amy;
    private PhotoCard jubelle;
    private PhotoCard terry;
    private PhotoCard polina;
    private PhotoCard kevin;
    private PhotoCard jason;

    private NameCard ethanN;
    private NameCard winnieN;
    private NameCard amyN;
    private NameCard jubelleN;
    private NameCard terryN;
    private NameCard polinaN;
    private NameCard kevinN;
    private NameCard jasonN;




    public GUI() {
        runApp();
    }

    private void runApp() {
        initCards();
        frame = new JFrame();
        panel = new JPanel();
        left = new JPanel();
        right = new JPanel();

        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card Matching Game");
        frame.add(panel);
        panel.add(left);
        panel.add(right);


//        panel1.setLayout(new GridLayout(3, 2));
        left.add(play = new JButton("Play game"));
        right.add(slider = new JSlider());
//        ImageIcon icon = new ImageIcon(ethan.photo_path);
//        panel.add(new JButton(icon));
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

        ethanN = new NameCard("Ethan");
        winnieN = new NameCard("Winnie");
        amyN = new NameCard("Amy");
        jubelleN = new NameCard("Jubelle");
        terryN = new NameCard("Terry");
        polinaN = new NameCard("Polina");
        kevinN = new NameCard("Kevin");
        jasonN = new NameCard("Jason");
    }
}
