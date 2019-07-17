package com.jms.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import com.jms.deck.Deck;
import java.util.Collections;

public class CardShuffler extends JFrame {

    private static final long serialVersionUID = 1L;
    private static JPanel deck = new JPanel(new GridLayout(0, 13));
    private static JPanel control = new JPanel(new FlowLayout());
    private static Font cardFont = new Font(Font.MONOSPACED, Font.PLAIN, 36);
    private static Font faceFont = new Font(Font.MONOSPACED, Font.PLAIN, 18);
    private static List<JPanel> cards = new ArrayList<JPanel>();

    public CardShuffler() {
        super("Card Shuffler");
        add(deck, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }

    private static void resetDeck() {
        deck.removeAll();
        cards.clear();
        for(int i = 0; i < Deck.cards.length; i++) {
            JPanel panel = new JPanel(new BorderLayout());
            cards.add(panel);
            cards.get(i).setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cards.get(i).setBackground(Color.WHITE);

            JLabel card = new JLabel(Deck.cards[i].getUnicode(), SwingConstants.CENTER);
            card.setForeground(Deck.cards[i].getColor());
            card.setFont(cardFont);

            JLabel face = new JLabel(
                String.format("%s%s", Deck.cards[i].getFace(), Deck.cards[i].getSuit().getSymbol()),
                SwingConstants.CENTER
            );
            face.setForeground(Deck.cards[i].getColor());
            face.setFont(faceFont);

            cards.get(i).add(card, BorderLayout.CENTER);
            cards.get(i).add(face, BorderLayout.SOUTH);
            deck.add(panel);
        }
        deck.revalidate();
        deck.repaint();
    }
    
    private static void shuffleDeck() {
        deck.removeAll();
        Collections.shuffle(cards);
        for(int i = 0; i < Deck.cards.length; i++) {
            deck.add(cards.get(i));
        }
        deck.revalidate();
        deck.repaint();
    }

    private static void loadControl() {
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetDeck();
            }
        });

        JButton shuffle = new JButton("Shuffle");
        shuffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shuffleDeck();
            }
        });

        control.add(reset);
        control.add(shuffle);
    }

    public static void main(String[] args) {
        CardShuffler app = new CardShuffler();
        app.setSize(600, 400);
        app.setResizable(false);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        resetDeck();
        loadControl();

        app.setVisible(true);
    }

}
