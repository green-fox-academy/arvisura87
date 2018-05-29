import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plantList;

  public Garden(Plant... plants) {
    plantList = new ArrayList<>();

    for (Plant plant: plants) {
      plantList.add(plant);
    }
  }
}
