package com.jms.card;

import java.awt.Color;

import com.jms.suit.Suit;

public class Card {

    private String unicode;
    private Suit suit;
    private String face;
    private Integer value;
    private Color color;

    public Card(String unicode, Suit suit, String face, Integer value, Color color) {
        this.unicode = unicode;
        this.suit = suit;
        this.face = face;
        this.value = value;
        this.color = color;
    }

    public String getUnicode() {
        return unicode;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }

    public Integer getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
}
