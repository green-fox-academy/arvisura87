public class Flower extends Plant{

  public Flower(String color) {
    super(color);
  }

  @Override
  public void watering(double amountOfWater) {

    if (this.currentWater < 5) {
      this.currentWater += 0.75 * amountOfWater;
    }
  }
}
