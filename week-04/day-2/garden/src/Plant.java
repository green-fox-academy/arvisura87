public class Plant {

  String color;
  double currentWater;
  boolean needWater;

  public Plant(String color) {
    this.color = color;
    this.currentWater = 0.0;
    this.needWater = true;
  }

  public void watering(double amountOfWater) {
    this.currentWater += amountOfWater;
  }

  @Override
  public String toString() {
    String result = "The ";
    if (this.needWater) {
      return result += this.color + this.getClass() + " needs water.";
    } else {
      return result += this.color + this.getClass() + " doesn' t need water.";
    }
  }
}
