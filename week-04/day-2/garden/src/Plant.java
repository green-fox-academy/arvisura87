public class Plant {

  String color;
  double currentWater;

  public Plant(String color) {
    this.color = color;
    this.currentWater = 0.0;
  }

  public void watering(double amountOfWater) {
    this.currentWater += amountOfWater;
  }
}
