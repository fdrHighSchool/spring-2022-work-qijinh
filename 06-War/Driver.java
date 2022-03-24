import java.util.*;

public class Driver {
  public static void main(String[] args) {

    // create a deck for testing
    Deck deck1 = new Deck();

    System.out.println(deck1.getLength()); // 52 cards in a standard deck
    for (int i = 0; i < 9; i++){
    deck1.shuffle();
  }
    deck1.displayDeck();
    System.out.println(deck1.getLength()); // 52 cards in a standard deck

  }
}
