package animals;

public class Bird extends Animal {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breed = "laying eggs.";
    return breed;
  }
}