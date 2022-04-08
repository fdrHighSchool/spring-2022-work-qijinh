public class Groceries {

  public static void main (String[] args) {

    ArrayList<Item> receipt = new ArrayList<Item>();
    receipt.add(new Item("apple", 2.49, 4, "fruit"));
    receipt.add(new Item("milk", 5.49, 3, "dairy"));
    receipt.add(new SaleItem("bread", 2.99, 5, "bakery", 20))

    System.out.println(receipt);

  }

}
