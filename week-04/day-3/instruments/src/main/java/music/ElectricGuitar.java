package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    this.numberOfStrings = 6;
    this.name = "Electric Guitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Electric Guitar";
  }

  public ElectricGuitar(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }

  @Override
  public String sound() {
    return "Twag";
  }

  @Override
  public void play() {
    System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
