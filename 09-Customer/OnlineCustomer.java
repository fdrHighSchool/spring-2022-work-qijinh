 // Complete the OnlineCustomer class to inherit from Customer
 // It should have an email attribute,
 // a constructor with 3 arguments (name, address, email) that uses the super constructor,
 // and an overridden toString() method that calls the super toString() method
 //  and then prints "\nEmail:" and the email variable.
public class OnlineCustomer extends Customer {
  private String email;

  public OnlineCustomer(String n, String a, String e) {
     super(n, a);
     email = e;

  }

  public String toString() {
     return super.toString() + "\nEmail: " + email;
  }

}
