package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String  breed() {
    String breed = "pushing miniature versions out.";
    return breed;
  }
}
