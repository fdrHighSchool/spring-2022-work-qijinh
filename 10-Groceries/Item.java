public class Item {

  private String name;
  private double price;
  private int quantity;
  private String department;

  public Item(String n, double p, int q, String d) {
    name = n;
    price = p;
    quantity = q;
    department = d;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDepartment() {
    return department;
  }

  public double getTotalPrice() {
    return price*quantity;
  }

  public void toString() {

  }

}
