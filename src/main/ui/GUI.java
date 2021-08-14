package ui;

import model.NameCard;
import model.PhotoCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;

public class GUI implements ActionListener {

    private JFrame frame;

    private int WIDTH = 1000;
    private int HEIGHT = 750;
    //number of cards
    private final int NUM = 7;

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

    //lists of cards
    private PhotoCard[] lop;
    private NameCard[] lon;

    //lists of photo buttons
    private JButton[] lopb;
    //lists of name buttons
    private JButton[] lonb;

    //selection process
    private int cardsSelected = 0;
    private String photoCardSelected = "";
    private String nameCardSelected = "";


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
      panel_tmp.add(homeButton());
      frame.getContentPane().add(panel_tmp);
    }

    // home button w/o action listener
    private JButton homeButton() {
        JButton home = new JButton("HOME");
        return home;
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
        //based on 7 cards, can be changed
        JPanel left = new JPanel(new GridLayout(4,2));
        JPanel right = new JPanel(new GridLayout(4,2));
        left.setBackground(Color.orange); // I set these different colours to see if it works
        right.setBackground(Color.white); // I set these different colours to see if it works
        back.add(left);
        back.add(right);
        frame.getContentPane().add(back);

        makePhotoButton(left);
        makeNameButton(right);
    }

    private void makePhotoButton(JPanel panel){
        for(int i = 0; i<NUM; i++){
            final JButton button = new JButton();
            button.setName(lop[i].getName());
            button.setIcon(new ImageIcon(lop[i].getPhoto_path()));
//            ImageIcon photo = new ImageIcon(lop[i].getPhoto_path());
//            Image resizedPhoto = photo.getImage();
//            resizedPhoto.getScaledInstance(50, -1, Image. SCALE_SMOOTH);
//            button.setIcon((Icon) resizedPhoto);

            button.addActionListener(e -> photoButtonClicked(button));
//            button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            panel.add(button);
//            lopb[i] = button;
        }
    }

    private void photoButtonClicked(JButton button){
        photoCardSelected = button.getName();
        checkCorrect();
    }

    private void makeNameButton(JPanel panel){
        for(int i = 0; i<NUM; i++){
            final JButton button = new JButton(lon[i].getName());
            button.setName(lon[i].getName());
            button.addActionListener(e -> nameButtonClicked(button));
//            button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            panel.add(button);
//            lonb[i] = button;
        }
    }

    private void nameButtonClicked(JButton button){
        nameCardSelected = button.getName();
        checkCorrect();
    }

    private void checkCorrect(){
        if(photoCardSelected.equals(nameCardSelected)){
            popup("Correct!","");
            resetSelected();
        }else if(!photoCardSelected.equals(nameCardSelected) &&
                !photoCardSelected.equals("") && !nameCardSelected.equals("")){
            popup("Try again!", "");
            resetSelected();
        }
    }

    private void resetSelected(){
//        for (int i = 0;i < NUM; i++){
//            if(lopb[i].getName().equals(photoCardSelected)){
//                lopb[i].setBackground(Color.BLACK);
//            }
//        }
//        for (int i = 0;i < NUM; i++){
//            if(lonb[i].getName().equals(nameCardSelected)){
//                lonb[i].setBackground(Color.BLACK);
//            }
//        }
        photoCardSelected = "";
        nameCardSelected = "";


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void initCards() {
        ethan = new PhotoCard("Ethan","src/Ethan.jpeg");
        winnie = new PhotoCard("Winnie","src/Winnie.jpeg");
        amy = new PhotoCard("Amy","src/Amy.jpeg");
        jubelle = new PhotoCard("Jubelle","src/Jubelle.jpeg");
        terry = new PhotoCard("Terry","src/Terry.JPG");
        polina = new PhotoCard("Polina","src/Polina.jpeg");
        kevin = new PhotoCard("Kevin","src/Kevin.jpeg");
        jason = new PhotoCard("Jason","src/Jason.jpeg");
        lop = new PhotoCard[]{ethan,winnie,amy,jubelle,terry,polina,kevin,jason};
        Collections.shuffle(Arrays.asList(lop));

        ethanN = new NameCard("Ethan");
        winnieN = new NameCard("Winnie");
        amyN = new NameCard("Amy");
        jubelleN = new NameCard("Jubelle");
        terryN = new NameCard("Terry");
        polinaN = new NameCard("Polina");
        kevinN = new NameCard("Kevin");
        jasonN = new NameCard("Jason");
        lon = new NameCard[]{ethanN,winnieN,amyN,jubelleN,terryN,polinaN,kevinN,jasonN};
        Collections.shuffle(Arrays.asList(lon));
    }

    //EFFECTS: create a pop up message box
    private void popup(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, "InfoBox "
                + title, JOptionPane.INFORMATION_MESSAGE);
    }
}
