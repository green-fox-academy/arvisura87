import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private String name;
  private List<Student> studentList;
  private List<Mentor> mentorList;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.mentors = new ArrayList<Mentor>();
  }

  public void addStudent(Student student) {
    studentList.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentorList.add(mentor);
  }
}
