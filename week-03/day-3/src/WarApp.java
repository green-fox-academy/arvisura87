public class WarApp {

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

    Pirate pirate6 = new Pirate("Elemér");
    Pirate pirate7 = new Pirate("Aladár");
    Captain captain3 = new Captain("Corleone");
    Ship ship3 = new Ship();
    ship3.fillShip(captain3, pirate6, pirate7);

    Armada armada1 = new Armada();
    Armada armada2 = new Armada();
    armada1.fillArmada(ship1, ship3);
    armada2.fillArmada(ship2);

    System.out.println(armada1.war(armada2));
  }
}
