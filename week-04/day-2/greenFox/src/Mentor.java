public class Mentor extends Person {

  private String level;

  public Mentor() {
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
