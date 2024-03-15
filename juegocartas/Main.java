package juegocartas;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Deck miDeck = new Deck();
        miDeck.shuffle();
        miDeck.head();
        miDeck.pick();
        miDeck.hand();
    }
}