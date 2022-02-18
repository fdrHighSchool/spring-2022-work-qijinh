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

  public Student(String id, String n, int[] g) {
    this.id = id;
    this.name = n;
    this.closeContact = false;
    this.grades = g;

  }


  //behaviors (methods)

  public double getAverage() {
    int total = 0;
    for (int grade : this.grades) {
      total += grade;
    }
    return total / grades.length;
  }


  //get the status of the student
  public boolean isCloseContact() {
    return this.closeContact;

  }

  public boolean setCloseContact(boolean cc) {
    return this.closeContact = cc;
  }

  //see if the student is failing
  public boolean isFailing() {
    if (getAverage() / this.grades.length > 65){
      return true;
    }
    return false;
  }

  //get object's name value
  public String getName() {
    return this.name;

  }

  public String toString() {
    return this.name + ": " + this.id;

  }

}
