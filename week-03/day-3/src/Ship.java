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
}
