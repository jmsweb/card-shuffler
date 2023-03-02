package com.jms.card;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import com.jms.suit.Suit;

public class TestCard {

    private static Card backside;
    private static Card card;

    @Test
    public final void testCard() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertNotNull(backside);
        assertNotNull(card);
    }

    @Test
    public final void testGetUnicode() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertEquals("\uD83C\uDCA0", backside.getUnicode());
        assertEquals("\uD83C\uDCA1", card.getUnicode());
    }

    @Test
    public final void testGetSuit() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertNull(backside.getSuit());
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public final void testGetFace() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertNull(backside.getFace());
        assertEquals("A", card.getFace());
    }

    @Test
    public final void testGetValue() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertNull(backside.getFace());
        assertEquals(Integer.valueOf(1), card.getValue());
    }

    @Test
    public final void testGetColor() {
    	backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
        assertEquals(Color.BLUE, backside.getColor());
        assertEquals(Color.BLACK, card.getColor());
    }

}