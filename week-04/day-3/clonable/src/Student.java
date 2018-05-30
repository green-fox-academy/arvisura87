public class Student extends Person implements Cloneable{

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;

  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    return new Student(name, age, gender, previousOrganization);
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.name
        + "a "
        + this.age
        + " year old "
        + this.gender
        + " from "
        + previousOrganization
        + " who skipped " + skippedDays
        + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }


}