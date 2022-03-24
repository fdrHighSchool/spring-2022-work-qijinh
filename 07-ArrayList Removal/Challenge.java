import java.util.*;

public class Challenge{

  public static void main (String[] args) {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < 99; i++) {
      numbers.add((int)(Math.random() * 999));
    }

    System.out.println(numbers);
    System.out.println();

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        numbers.remove(i);
        i--;
      }
    }

    System.out.println(numbers);
  }

}
