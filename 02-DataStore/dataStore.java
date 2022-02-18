public class DataStore {
  public static void main(String[] args) {

    Student student1 = new Student("1234567", "Jimmy Smith", true, new int[] {90, 80, 95, 90, 100});
    Student student2 = new Student("9876543", "Maria Hernandez", new int[] {95, 100, 100, 90, 90});
    Student student3 = new Student("1357911", "Jamal Jenkins", new int[] {85, 85, 95, 100, 90});
    Student student4 = new Student("2468101", "Ramiz Ahmed", true, new int[] {90, 100, 75, 85, 90});
    Student student5 = new Student("1928374", "Michael Green", true, new int[] {80, 80, 65, 55, 90});

    Student[] stu = {student1, student2, student3, student4, student5};
    String cc = "Close Contact Students: ";

    for (int i = 0; i < stu.length; i++){
      System.out.println(stu[i].getName() + "s average is: " + stu[i].getAverage());

      if (stu[i].isCloseContact()){
        System.out.println("Please report to the auditortium for your take-home test kit.");
        cc += stu[i].getName() + "   ";
      }
      else {
        System.out.println("Not a close contact. Keep Masking! Get Boosted!");
      }
      System.out.println();
    }

    System.out.println(cc);

 } // end main method

} // end class
