import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  }

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }

  public void shuffle() {
    ArrayList<Card> shuffledDeck = new ArrayList<Card>();

    for (int i = 0; i < 52; i++){
      int r = (int)(Math.random() * (this.deck.size() - 1));

      shuffledDeck.add(this.deck.get(r));
      this.deck.remove(r);
    }

    this.deck = shuffledDeck;
  }

} // end class
