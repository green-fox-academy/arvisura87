public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student("John", 20, "male", "bme");
    Student student1 = student.clone();

    System.out.println(student.equals(student1));
  }
}
