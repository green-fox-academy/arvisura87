import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private String name;
  private List<Student> studentList;
  private List<Mentor> mentorList;

  public Cohort(String name) {
    this.name = name;
    this.studentList = new ArrayList<Student>();
    this.mentorList = new ArrayList<Mentor>();
  }

  public void addStudent(Student student) {
    studentList.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentorList.add(mentor);
  }

  public void info() {
    System.out.println("The "
        + this.name
        + "cohort has "
        + this.studentList.size()
        + " students and "
        + this.mentorList.size()
        + " mentors.");
  }
}
