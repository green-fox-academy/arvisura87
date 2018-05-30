package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.numberOfStrings = 4;
    this.name = "Bass Guitar";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Bass Guitar";
  }

  public BassGuitar(String name, int numberOfStrings) {
    super(name, numberOfStrings);
  }


  @Override
  public void play() {
    System.out.println(super.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
