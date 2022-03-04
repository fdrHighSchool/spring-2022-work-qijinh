public class Driver {

  public static void main (String[] args) {
    StepTracker person1 = new StepTracker (10000);
    person1.addDailySteps(9999);
    person1.addDailySteps(11000);
    person1.addDailySteps(13300);
    person1.addDailySteps(19000);
    person1.addDailySteps(22200);
    System.out.println("person1 active days: " + person1.activeDays());
    System.out.println("person1 total days: " + person1.day());
    System.out.println("person1 average steps: " + person1.averageSteps());
    System.out.println("person1 total steps: " + person1.steps());
    System.out.println();


    StepTracker person2 = new StepTracker (10000);
    person2.addDailySteps(12000);
    person2.addDailySteps(33000);
    person2.addDailySteps(22000);
    person2.addDailySteps(9999);
    person2.addDailySteps(9999);
    System.out.println("person2 active days: " + person2.activeDays());
    System.out.println("person2 total days: " + person2.day());
    System.out.println("person2 average steps: " + person2.averageSteps());
    System.out.println("person2 total steps: " + person2.steps());
    System.out.println();


  }

}
