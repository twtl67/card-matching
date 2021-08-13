package ui;

import model.NameCard;
import model.PhotoCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;

    private int WIDTH = 1000;
    private int HEIGHT = 750;

    CardLayout card;

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
        setUpFrame();
        displayStart();
        frame.setVisible(true);
    }

    // sets up frame
    private void setUpFrame() {
        frame = new JFrame();
        frame.setTitle("Card Matching Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        card = new CardLayout();
        frame.getContentPane().setLayout(card);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
    }

    // displays start menu
    private void displayStart() {
      JPanel panel_tmp = new JPanel(); // can add layout to this to add a picture
      panel_tmp.add(startButton());
      frame.getContentPane().add(panel_tmp);
    }

    // start button w/ action listener
    private JButton startButton() {
        JButton start = new JButton("START");
        start.addActionListener(e -> playGame());
        return start;
    }

    // sets up game panels, goes to next card panel (game)
    private void playGame() {
        setUpGame();
        card.next(frame.getContentPane());
    }

    // sets up area for game
    private void setUpGame() {
        JPanel back = new JPanel(new GridLayout(0,2));
        JPanel left = new JPanel();
        JPanel right = new JPanel();
        left.setBackground(Color.orange); // I set these different colours to see if it works
        right.setBackground(Color.white); // I set these different colours to see if it works
        back.add(left);
        back.add(right);
        frame.getContentPane().add(back);
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
