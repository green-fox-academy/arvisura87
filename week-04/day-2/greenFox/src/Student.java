public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super();
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
}
