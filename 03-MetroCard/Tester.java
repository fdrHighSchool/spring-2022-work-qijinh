public class Tester {

  public static void main (String[] args) {

    int i = 1;
    MetroCard card1 = new MetroCard ("Student", 0, i);
    i++;
    MetroCard card2 = new MetroCard ("Normal", 20+2, i);
    i++;
    MetroCard card3 = new MetroCard ("Monthly", 0, i);
    i++;

    card1.swipe();
    card2.swipe();
    card3.swipe();

  }

}
