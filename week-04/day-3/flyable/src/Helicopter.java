public class Helicopter extends Vehicle implements  Flyable{
  @Override
  public void land() {
    System.out.println("így");
  }

  @Override
  public void fly() {
    System.out.println("úgy");
  }

  @Override
  public void takeOff() {
    System.out.println("amúgy");
  }
}
