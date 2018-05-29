import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plantList;

  public Garden() {
    plantList = new ArrayList<>();
  }

  public Garden(Plant... plants) {
    plantList = new ArrayList<>();

    for (Plant plant : plants) {
      plantList.add(plant);
    }
  }

  public void gardenWatering(double amountWater) {
    System.out.println("Watering with: " + amountWater);
    List<Plant> theseNeedWater = new ArrayList<>();

    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).needWater) {
        theseNeedWater.add(plantList.get(i));
      }
    }

    for (int i = 0; i < theseNeedWater.size(); i++) {
      theseNeedWater.get(i).watering(amountWater / theseNeedWater.size());
    }
  }
}
