public class MetroCard {

  private int time;
  private int cardUse;
  private String cardID;
  private double cardAmount;
  private String cardType;


  public MetroCard (String type, String i) {
    if (type == "Student") {
      this.cardID = i;
      this.cardType = "Student";
      this.cardUse = 3;
      this.time = 0;
    }
    else if (type == "Monthly") {
      this.cardID = i;
      this.cardType = "Monthly";
      this.cardUse = 999999;
      this.time = 0;
    }
    else if (type == "OneTime") {
      this.cardID = i;
      this.cardType = "OneTime";
      this.cardUse = 1;
      this.time = 0;
    }
    else if (type == "TwoTime") {
      this.cardID = i;
      this.cardType = "TwoTime";
      this.cardUse = 2;
      this.time = 0;
    }

  }

  public MetroCard (double money, String i){
    this.cardID = i;
    this.cardType = "Normal";
    double k = money / 2.75;
    this.cardUse = (int)k;
    this.cardAmount = money;
    this.time = 0;

  }

  public void swipe (int time) {
    if (this.cardUse > 0) {
        if (this.cardType == "Student" && time - this.time >= 15 && time >= 0530 && time <= 2030) {
          this.cardUse--;
          System.out.println("Card " + this.cardID + " Pass! Card Remains " + this.cardUse + " Trips");
        }
        else if (this.cardType == "Normal"){
          this.cardUse--;
          this.cardAmount = cardAmount - 2.75;
          System.out.println("Card " + this.cardID + " Pass! Card Remains " + this.cardAmount);
        }
        else if (this.cardType == "Monthly" && time - this.time >= 15){
          this.cardUse--;
          System.out.println("Card " + this.cardID + " Pass! Enjoy your trip!");
        }
        else if (this.cardType == "OneTime"){
          this.cardUse--;
          System.out.println("Card " + this.cardID + " Pass! Card Used");
        }
        else if (this.cardType == "TwoTime"){
          this.cardUse--;
          if (this.cardUse == 1)
          System.out.println("Card " + this.cardID + " Pass! Card Remains 1 Trips");
          else if (this.cardUse == 0)
          System.out.println("Card " + this.cardID + " Pass! Card Used");
        }
        this.time = time;
        System.out.println();

    }
    else
      System.out.println("Invalid Card Swipe! Please Charge Your MetroCard!");

  }

  public String toString() {
    return "MetroCard " + this.cardID + "has " + this.cardUse + "ride left.";

  }

}
