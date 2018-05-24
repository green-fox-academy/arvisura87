import java.util.ArrayList;

public class Armada {

  ArrayList<Ship> armada;

  public void fillArmada(Ship... ships){
    armada = new ArrayList<>();

    for (int i = 0; i < ships.length; i++) {
        armada.add(ships[i]);
    }
  }

  public boolean war(Armada enemy){
    int thisShips = this.armada.size();
    int enemyShips = enemy.armada.size();
    int counterThisShip = 0;
    int counterEnemyShip = 0;

    while (thisShips != 0 && enemyShips != 0){
      boolean whoWon = this.armada.get(counterThisShip).battle(enemy.armada.get(counterEnemyShip));
        if (whoWon){
          enemyShips--;
          counterEnemyShip++;
        } else {
          thisShips--;
          counterThisShip++;
        }
    }
    return thisShips > enemyShips ? true : false;
  }
}
