package day12.userdefinedexp;
//Program to define service class
public class StudentService {

  public void setMarks(Student student, int[] marks) throws InvalidMarksException {
      for (int mark : marks) {
          if (mark < 0 || mark > 100) {
              throw new InvalidMarksException("Invalid marks found: " + mark + ". Marks should be between 0 and 100.");
          }
      }
      student.setMarks(marks);
      calculatePercentage(student);
  }

  private void calculatePercentage(Student student) {
      int[] marks = student.getMarks();
      int sum = 0;
      for (int mark : marks) {
          sum += mark;
      }
      float percentage = (float) sum / marks.length;
      student.setPer(percentage);
  }
}