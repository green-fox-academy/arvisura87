package animals;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private String color;
  private int numberOfLegs;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    String name = this.name;
    return name;
  };
  public abstract String breed();
}
