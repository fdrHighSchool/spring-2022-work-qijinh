public class MetroCard {

  private int cardID;
  private int cardUse;
  private double cardAmount;
  private String cardType;


  public MetroCard (String type, double money, int i) {
    if (type == "Student") {
      this.cardID = i;
      this.cardType = "Student";
      this.cardUse = 3;
    }
    else if (type == "Normal") {
      this.cardID = i;
      this.cardType = "Normal";
      double k = money / 2.75;
      this.cardUse = (int)k;
      this.cardAmount = money;
    }
    else if (type == "Monthly") {
      this.cardID = i;
      this.cardType = "Monthly";
      this.cardUse = 999999;
    }
    else if (type == "OneTime") {
      this.cardID = i;
      this.cardType = "OneTime";
      this.cardUse = 1;
    }
    else if (type == "TwoTime") {
      this.cardID = i;
      this.cardType = "TwoTime";
      this.cardUse = 2;
    }

  }

  public void swipe () {
    if (this.cardUse > 0) {
      this.cardUse--;
      if (this.cardType == "Student"){
        System.out.println("Card " + this.cardID + " Pass! Card Remains " + this.cardUse + " Trips");
      }
      else if (this.cardType == "Normal"){
        this.cardAmount = cardAmount - 2.75;
        System.out.println("Card " + this.cardID + " Pass! Card Remains " + this.cardAmount);
      }
      else if (this.cardType == "Monthly"){
        System.out.println("Card " + this.cardID + " Pass! Enjoy your trip!");
      }
      else if (this.cardType == "OneTime"){
        System.out.println("Card " + this.cardID + " Pass! Card Used");
      }
      else if (this.cardType == "TwoTime"){
        if (this.cardUse == 1)
        System.out.println("Card " + this.cardID + " Pass! Card Remains 1 Trips");
        else if (this.cardUse == 0)
        System.out.println("Card " + this.cardID + " Pass! Card Used");
      }

    }
    else
      System.out.println("Invalid Card Swipe! Please Charge Your MetroCard!");

  }

}
