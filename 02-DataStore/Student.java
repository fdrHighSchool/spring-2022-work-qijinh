public class Student {

  //fields, instance varaibles (data)
  //each instance of the Staudent class gets a copy of each varaible
  private String id;
  private String name;
  private boolean closeContact;
  private int[] grades;


  //constuctor (method)
  public Student(String id, String n, boolean cc, int[] g) {
    this.id = id;
    this.name = n;
    this.closeContact = cc;
    this.grades = g;
    
  }


  //behaviors (methods)

  //get the status of the student
  public boolean isCloseContact() {


  }

  //set the value of close contact
  public void setColseContact(boolean value) {


  }

  //see if the student is failing
  public boolean isFailing() {


  }

  //get object's name value
  public String getName() {


  }

}
