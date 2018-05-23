public class BattleApp {

  public static void main(String[] args) {

    Pirate pirate1 = new Pirate("Béla");
    Pirate pirate2 = new Pirate("Kázmér");
    Captain captain1 = new Captain("Kartács");
    Ship ship1 = new Ship();
    ship1.fillShip(captain1, pirate1, pirate2);

    Pirate pirate3 = new Pirate("Ödön");
    Pirate pirate4 = new Pirate("Géza");
    Pirate pirate5 = new Pirate("Árpi");
    Captain captain2 = new Captain("Don");
    Ship ship2 = new Ship();
    ship2.fillShip(captain2, pirate3, pirate4, pirate5);

    ship1.battle(ship2);
  }
}
