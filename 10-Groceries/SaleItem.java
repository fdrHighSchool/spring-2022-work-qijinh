public class SaleItem extends Item {

  private double off;

  public SaleItem(String n, double p, int q, String d, int o) {
    super(n, p, q, d);
    off = (100 - o)*0.1;
  }

  public int percentOff() {
    return (1 - off)*100;
  }

}
