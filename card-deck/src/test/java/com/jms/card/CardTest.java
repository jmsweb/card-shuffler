package com.jms.card;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jms.suit.Suit;

public class CardTest {

    private static Card backside;
    private static Card card;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        backside = null;
        card = null;
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        backside = null;
        card = null;
    }

    @Before
    public void setUp() throws Exception {
        backside = new Card("\uD83C\uDCA0", null, null, null, Color.BLUE);
        card = new Card("\uD83C\uDCA1", Suit.SPADES, "A", 1, Color.BLACK);
    }

    @After
    public void tearDown() throws Exception {
        backside = null;
        card = null;
    }

    @Test
    public final void testCard() {
        assertNotNull(backside);
        assertNotNull(card);
    }

    @Test
    public final void testGetUnicode() {
        assertEquals("\uD83C\uDCA0", backside.getUnicode());
        assertEquals("\uD83C\uDCA1", card.getUnicode());
    }

    @Test
    public final void testGetSuit() {
        assertNull(backside.getSuit());
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public final void testGetFace() {
        assertNull(backside.getFace());
        assertEquals("A", card.getFace());
    }

    @Test
    public final void testGetValue() {
        assertNull(backside.getFace());
        assertEquals(Integer.valueOf(1), card.getValue());
    }

    @Test
    public final void testGetColor() {
        assertEquals(Color.BLUE, backside.getColor());
        assertEquals(Color.BLACK, card.getColor());
    }

}
