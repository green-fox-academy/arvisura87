public class App {

  public static void main(String[] args) {

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    Garden garden = new Garden(flower1, flower2, tree1, tree2);

    System.out.println(flower1.toString());
    System.out.println(flower2.toString());
    System.out.println(tree1.toString());
    System.out.println(tree2.toString() + "\n");

    garden.gardenWatering(40);
    System.out.println(flower1.toString());
    System.out.println(flower2.toString());
    System.out.println(tree1.toString());
    System.out.println(tree2.toString() + "\n");

    garden.gardenWatering(70);
    System.out.println(flower1.toString());
    System.out.println(flower2.toString());
    System.out.println(tree1.toString());
    System.out.println(tree2.toString() + "\n");
  }
}
