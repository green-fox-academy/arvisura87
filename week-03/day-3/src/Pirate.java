public class Pirate {

  boolean isAlive;
  boolean isAwake;
  boolean isToxic;
  int howManyDrinksWas;

  public Pirate(){
    this.isAlive = true;
    this.isAwake = true;
    this.isToxic = false;
    this.howManyDrinksWas = 0;
  }

  public void drinkSomeRum(){
    if (this.isAlive) {
      this.isToxic = true;
      this.howManyDrinksWas++;
    } else {
      System.out.println("he's dead");
    }
  }

  public void howsItGoingMate(){
    if (this.isAlive){
      if (this.howManyDrinksWas < 5){
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.isAwake = false;
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public void die(){
    this.isAlive = false;
  }
}
