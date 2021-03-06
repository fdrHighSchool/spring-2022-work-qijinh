public class StepTracker {

  private int min;
  private int step;
  private int day;
  private int activeDay;

  public StepTracker(int s) {
    this.min = s;
    this.step = 0;
    this.day = 0;
    this.activeDay = 0;

  }

  public int steps(){
    return this.step;
  }

  public int day(){
    return this.day;
  }

  public int activeDays() {
    return activeDay;
  }

  public double averageSteps() {
    if (day == 0){
      return 0.0;
    }
    else{
      return (double) step / day;
    }

  }

  public void addDailySteps(int s) {
    this.step += s;
    this.day++;
    if (s >= this.min) {
      this.activeDay++;
    }
  }

}
