package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    this.numberOfStrings = 4;
    this.name = "Violin";
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Violin";
  }

  public Violin(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
