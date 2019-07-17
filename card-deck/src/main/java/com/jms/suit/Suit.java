package com.jms.suit;

public enum Suit {

    HEARTS("\u2665"),
    DIAMONDS("\u2666"),
    CLUBS("\u2663"),
    SPADES("\u2660");

    private final String symbol;

    private Suit(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
