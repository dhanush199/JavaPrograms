package com.bridgelabz.objectorientedprograms;


import com.bridgelabz.utility.DataStructureUtility;

public class DeckQueue2 {
    public static void main(String[] args) {
        String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int n = Suits.length * Ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length * i + j] = Ranks[i] + " " + Suits[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        com.bridgelabz.utility.QueueLinkedList<com.bridgelabz.utility.QueueLinkedList<String>> mainQueue=DataStructureUtility.deckQueueStore(deck);
        DataStructureUtility.displayDeck(mainQueue);
    }
}
