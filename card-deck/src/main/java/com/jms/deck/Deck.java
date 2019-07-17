package com.jms.deck;

import java.awt.Color;

import com.jms.card.Card;
import com.jms.suit.Suit;

public interface Deck {

    public Card backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);

    public Card[] cards = new Card[] {
        new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK),
        new Card("\uD83C\uDCA2", Suit.SPADES, "2", 2, Color.BLACK),
        new Card("\uD83C\uDCA3", Suit.SPADES, "3", 3, Color.BLACK),
        new Card("\uD83C\uDCA4", Suit.SPADES, "4", 4, Color.BLACK),
        new Card("\uD83C\uDCA5", Suit.SPADES, "5", 5, Color.BLACK),
        new Card("\uD83C\uDCA6", Suit.SPADES, "6", 6, Color.BLACK),
        new Card("\uD83C\uDCA7", Suit.SPADES, "7", 7, Color.BLACK),
        new Card("\uD83C\uDCA8", Suit.SPADES, "8", 8, Color.BLACK),
        new Card("\uD83C\uDCA9", Suit.SPADES, "9", 9, Color.BLACK),
        new Card("\uD83C\uDCAA", Suit.SPADES, "10", 10, Color.BLACK),
        new Card("\uD83C\uDCAB", Suit.SPADES, "J", 11, Color.BLACK),
        new Card("\uD83C\uDCAD", Suit.SPADES, "Q", 12, Color.BLACK),
        new Card("\uD83C\uDCAE", Suit.SPADES, "K", 13, Color.BLACK),
        new Card("\uD83C\uDCB1", Suit.HEARTS, "A", 1, Color.RED),
        new Card("\uD83C\uDCB2", Suit.HEARTS, "2", 2, Color.RED),
        new Card("\uD83C\uDCB3", Suit.HEARTS, "3", 3, Color.RED),
        new Card("\uD83C\uDCB4", Suit.HEARTS, "4", 4, Color.RED),
        new Card("\uD83C\uDCB5", Suit.HEARTS, "5", 5, Color.RED),
        new Card("\uD83C\uDCB6", Suit.HEARTS, "6", 6, Color.RED),
        new Card("\uD83C\uDCB7", Suit.HEARTS, "7", 7, Color.RED),
        new Card("\uD83C\uDCB8", Suit.HEARTS, "8", 8, Color.RED),
        new Card("\uD83C\uDCB9", Suit.HEARTS, "9", 9, Color.RED),
        new Card("\uD83C\uDCBA", Suit.HEARTS, "10", 10, Color.RED),
        new Card("\uD83C\uDCBB", Suit.HEARTS, "J", 11, Color.RED),
        new Card("\uD83C\uDCBD", Suit.HEARTS, "Q", 12, Color.RED),
        new Card("\uD83C\uDCBE", Suit.HEARTS, "K", 13, Color.RED),
        new Card("\uD83C\uDCC1", Suit.DIAMONDS, "A", 1, Color.RED),
        new Card("\uD83C\uDCC2", Suit.DIAMONDS, "2", 2, Color.RED),
        new Card("\uD83C\uDCC3", Suit.DIAMONDS, "3", 3, Color.RED),
        new Card("\uD83C\uDCC4", Suit.DIAMONDS, "4", 4, Color.RED),
        new Card("\uD83C\uDCC5", Suit.DIAMONDS, "5", 5, Color.RED),
        new Card("\uD83C\uDCC6", Suit.DIAMONDS, "6", 6, Color.RED),
        new Card("\uD83C\uDCC7", Suit.DIAMONDS, "7", 7, Color.RED),
        new Card("\uD83C\uDCC8", Suit.DIAMONDS, "8", 8, Color.RED),
        new Card("\uD83C\uDCC9", Suit.DIAMONDS, "9", 9, Color.RED),
        new Card("\uD83C\uDCCA", Suit.DIAMONDS, "10", 10, Color.RED),
        new Card("\uD83C\uDCCB", Suit.DIAMONDS, "J", 11, Color.RED),
        new Card("\uD83C\uDCCD", Suit.DIAMONDS, "Q", 12, Color.RED),
        new Card("\uD83C\uDCCE", Suit.DIAMONDS, "K", 13, Color.RED),
        new Card("\uD83C\uDCD1", Suit.CLUBS, "A", 1, Color.BLACK),
        new Card("\uD83C\uDCD2", Suit.CLUBS, "2", 2, Color.BLACK),
        new Card("\uD83C\uDCD3", Suit.CLUBS, "3", 3, Color.BLACK),
        new Card("\uD83C\uDCD4", Suit.CLUBS, "4", 4, Color.BLACK),
        new Card("\uD83C\uDCD5", Suit.CLUBS, "5", 5, Color.BLACK),
        new Card("\uD83C\uDCD6", Suit.CLUBS, "6", 6, Color.BLACK),
        new Card("\uD83C\uDCD7", Suit.CLUBS, "7", 7, Color.BLACK),
        new Card("\uD83C\uDCD8", Suit.CLUBS, "8", 8, Color.BLACK),
        new Card("\uD83C\uDCD9", Suit.CLUBS, "9", 9, Color.BLACK),
        new Card("\uD83C\uDCDA", Suit.CLUBS, "10", 10, Color.BLACK),
        new Card("\uD83C\uDCDB", Suit.CLUBS, "J", 11, Color.BLACK),
        new Card("\uD83C\uDCDD", Suit.CLUBS, "Q", 12, Color.BLACK),
        new Card("\uD83C\uDCDE", Suit.CLUBS, "K", 13, Color.BLACK)
    };
}
