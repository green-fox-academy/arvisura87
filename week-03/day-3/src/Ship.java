import java.util.ArrayList;
import java.util.List;

public class Ship {

  ArrayList<Pirate> crew;

  public void fillShip(Captain captain, Pirate... pirates){
    this.crew = new ArrayList<>();
    this.crew.add(captain);

    for (int i = 1; i < pirates.length; i++) {
      this.crew.add(pirates[i]);
    }
  }
}
