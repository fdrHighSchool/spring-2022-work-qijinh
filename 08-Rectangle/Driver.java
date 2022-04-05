public class Driver {
   public static void main(String[] args) {
      Rectangle r = new Rectangle(3,5);
      r.draw();
      Square s1 = new Square();
      s1.draw();
      Square s2 = new Square(3);
      s2.draw();
      LongRectangle l = new LongRectangle(5);
      l.draw();
      System.out.println(s2.area());
      System.out.println(l.area());
   }
}
