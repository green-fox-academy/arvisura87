public class Pirate {

  int drinkCounter = 0;
  boolean isToxic = false;
  boolean isAwake = true;

  public void drinkSomeRum(){
    this.isToxic = true;
    this.drinkCounter++;
  }

  public void howsItGoingMate(){
    if (this.drinkCounter < 5){
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.isAwake = false;
    }
  }
}
