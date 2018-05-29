public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public Sponsor() {
    this.company = "google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm "
        + this.name
        + "a "
        + this.age
        + " year old "
        + this.gender
        + " who represents "
        + this.company
        + " and hired "
        + this.hiredStudents
        + " students so far.");
  }
}
