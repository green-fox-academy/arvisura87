public class Pirate {

  String name;
  boolean isAlive;
  boolean isAwake;
  boolean isToxic;
  int howManyDrinksWas;

  public Pirate(String name){
    this.name = name;
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

  public void brawl(Pirate enemy){
    int endingChance = (int)(Math.random()*10);

    if (this.isAlive && enemy.isAlive){
      while (endingChance<1){
        endingChance = (int)Math.random();
      }
      if (endingChance >= 1 && endingChance <= 3){
        this.isAlive = false;
        System.out.println("Battle over, " + this.name + "died!");
      } else if (endingChance >= 4 && endingChance <= 6){
        enemy.isAlive = false;
        System.out.println("Battle over, " + enemy.name + "died!");
      } else {
        this.isAlive = false;
        enemy.isAlive = false;
        System.out.println("Battle over, " + this.name + "and" + enemy.name + " both died!");
      }
    } else if (this.isAlive){
      System.out.println("Oh, " + enemy.name + " is already dead, they can not have a fight!");
    } else if (enemy.isAlive){
      System.out.println("Oh, " + this.name + " is already dead, they can not have a fight!");
    } else {
      System.out.println("Oh, they already dead, there will be no fight!");
    }
  }
}
