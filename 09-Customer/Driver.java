public class Driver {
    public static void main(String[] args) {
       Customer c = new Customer("Fran Santiago", "123 Main St., Anytown, USA");
       System.out.println(c);

       System.out.println();

       OnlineCustomer c2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
       System.out.println(c2);
    }
}
