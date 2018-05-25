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
    int scoreThis = 0;
    int scoreEnemy = 0;
    int thisDeaths = 0;
    int enemyDeaths = 0;
    int rumParty = 0;

    thisDeaths = (int) Math.ceil(Math.random() * this.crew.size());
    enemyDeaths = (int) Math.ceil(Math.random() * enemyShip.crew.size());
    rumParty = (int) Math.ceil(Math.random() * 100);

    for (int i = 1; i < this.crew.size(); i++) {
      if (this.crew.get(i).isAlive){
        scoreThis++;
      }
    }

    for (int i = 1; i < enemyShip.crew.size(); i++) {
      if (enemyShip.crew.get(i).isAlive){
        scoreEnemy++;
      }
    }

    scoreThis -= this.crew.get(0).howManyDrinksWas;
    scoreEnemy -= enemyShip.crew.get(0).howManyDrinksWas;

    if (scoreThis > scoreEnemy){
      for (int i = 1; i < enemyDeaths; i++) {
        enemyShip.crew.get(i).die();
      }
    } else {
      for (int i = 1; i < thisDeaths; i++) {
        this.crew.get(i).die();
      }
    }
    
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

  private boolean whoWon(int scoreThis, int scoreEnemy) {
    return (scoreThis > scoreEnemy) ? true : false;
  }
}
