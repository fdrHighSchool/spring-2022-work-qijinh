import java.util.*;

public class Driver {
  public static void main(String[] args) {

    // create a deck for testing
    Deck deck1 = new Deck();
    deck1.shuffle();

    ArrayList<Card> p1 = new ArrayList<Card>();
    ArrayList<Card> p2 = new ArrayList<Card>();

    while (deck1.getLength() > 0) {
      p1.add(deck1.popCard());
      p2.add(deck1.popCard());
    }

    // System.out.println("Player 1 cards: ");
    // System.out.println(p1);
    // System.out.println(p1.size());
    // System.out.println();
    // System.out.println("Player 2 cards: ");
    // System.out.println(p2);
    // System.out.println(p2.size());
    // System.out.println();

    Card play1 = p1.remove(0);
    Card play2 = p2.remove(0);

    System.out.println("round1: ");
    System.out.println("player 1 plays a " + play1);
    System.out.println("player 2 plays a " + play2);
    System.out.println();

  }
}
