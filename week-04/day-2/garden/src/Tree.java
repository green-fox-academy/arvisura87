public class Tree extends Plant{

  public Tree(String color) {
    super(color);
  }

  @Override
  public void watering(double amountOfWater) {
    if (this.currentWater < 10) {
      this.currentWater += 0.4 * amountOfWater;
    }
  }
}
