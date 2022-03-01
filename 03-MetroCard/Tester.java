public class Tester {

  public static void main (String[] args) {

    int i = 1;
    MetroCard card1 = new MetroCard ("Student", "00001");
    i++;
    MetroCard card2 = new MetroCard (20+2, "0002");
    i++;
    MetroCard card3 = new MetroCard ("Monthly", "00003");
    i++;

    card1.swipe(0730);
    card2.swipe(1500);
    card3.swipe(1900);

  }

}
