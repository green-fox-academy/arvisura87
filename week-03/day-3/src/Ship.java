import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> crew;

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
    int alivePirates = 0;

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
}
