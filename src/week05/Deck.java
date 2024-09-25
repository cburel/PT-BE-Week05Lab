package week05;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  List<Card> cards = new ArrayList<Card>();
  
  Deck() {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    
    for (String suit : suits) {
      int i = 2;
      for (String name : names) {
        Card card = new Card(name, suit, i);
        this.cards.add(card);
        i++;
      }
    }
  }

  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }
  
  public void describe() {
    for (Card card: this.cards) {
     card.describe(); 
    }
  }
  
}
