import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> crew;
  int alivePirates = 0;

  public void fillShip(Captain captain, Pirate... pirates){
    this.crew = new ArrayList<>();
    this.crew.add(captain);

    for (int i = 0; i < pirates.length; i++) {
      this.crew.add(pirates[i]);
    }
  }

  @Override
  public String toString() {
    String result = "";
    String captainRum;
    String captainState;

    if (crew.get(0).isToxic){
      captainRum = "The captain did drink rum. ";
    } else {
      captainRum = "The captain did not drink rum. ";
    }

    if (crew.get(0).isAlive == true)
      if (crew.get(0).isAwake == true){
        captainState = "And he is awake. ";
      } else {
        captainState = "And he is passed out. ";
      }
      else {
      captainState = "And he is dead. ";
    }

    for (int i = 1; i < crew.size(); i++) {
      if (crew.get(i).isAlive){
        alivePirates++;
      }
    }

    result += captainRum + captainState + "And the number of alive pirates: " + alivePirates;

    return result;
  }

  public boolean battle(Ship enemyShip){
    int scoreThis = calculateThisScore();
    int scoreEnemy = calculateEnemyScore(enemyShip);
    int thisDeaths = randomThis(thisSize());
    int enemyDeaths = randomEnemy(enemySize(enemyShip));
    int rumParty = randomRum();

    loserMustDie(scoreThis, scoreEnemy, thisDeaths, enemyDeaths, enemyShip);
    
    if (scoreThis > scoreEnemy){
      for (int i = 0; i < this.crew.size(); i++) {
        this.crew.get(i).howManyDrinksWas += rumParty;
      }
    } else {
      for (int i = 0; i < enemyShip.crew.size(); i++) {
        enemyShip.crew.get(i).howManyDrinksWas += rumParty;
      }
    }
    return whoWon(scoreThis, scoreEnemy);
  }

  private void loserMustDie(int scoreThis, int scoreEnemy, int thisDeaths, int enemyDeaths, Ship enemyShip) {
    if (scoreThis > scoreEnemy){
      for (int i = 1; i < enemyDeaths; i++) {
        enemyShip.crew.get(i).die();
      }
    } else {
      for (int i = 1; i < thisDeaths; i++) {
        this.crew.get(i).die();
      }
    }
  }

  private int calculateEnemyScore(Ship enemyShip) {
    int result = 0;
    for (int i = 1; i < enemyShip.crew.size(); i++) {
      if (enemyShip.crew.get(i).isAlive){
        result++;
      }
    }
    result -= enemyShip.crew.get(0).howManyDrinksWas;

    return result;
  }

  private int calculateThisScore() {
    int result = 0;
    for (int i = 1; i < this.crew.size(); i++) {
      if (this.crew.get(i).isAlive){
        result++;
      }
    }
    result -= this.crew.get(0).howManyDrinksWas;

    return result;
  }

  private int enemySize(Ship enemy) {
    int result = enemy.crew.size();
    return result;
  }

  private int thisSize() {
    int result = this.crew.size();
    return result;
  }

  private int randomRum() {
    int result = (int) Math.ceil(Math.random() * 100);
    return result;
  }

  private int randomEnemy(int size) {
    int result = (int) Math.ceil(Math.random() * size);
    return result;
  }

  private int randomThis(int size) {
    int result = (int) Math.ceil(Math.random() * size);
    return result;
  }

  private boolean whoWon(int scoreThis, int scoreEnemy) {
    return (scoreThis > scoreEnemy) ? true : false;
  }
}
