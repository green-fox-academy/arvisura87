package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breed = "laying eggs.";
    return breed;
  }
}
