import java.util.ArrayList;

public class Armada {

  ArrayList<Ship> armada;

  public void fillArmada(Ship... ships){
    armada = new ArrayList<>();

    for (int i = 0; i < ships.length; i++) {
        armada.add(ships[i]);
    }
  }
}
