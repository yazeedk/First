import java.util.List;

public class ReportGenerator {
    private EnrollmentOperations operations;
    private Course course;



        public static void generateEnrolledStudentsReport(Course course, List<Student> students) {
            System.out.println("Enrolled Students Report for Course " + course.getCourseCode() + " - " + course.getTitle() + ":");
            for (Student student : students) {
                if (student.isEnrolledInCourse(course)) {
                    System.out.println("Student ID: " + student.getStudentID() + ", Name: " + student.getName());
                }
            }
            System.out.println("-----------------------");
        }




    public void generateStudentReport(Course course) {

        this.course = course;
    }

    public EnrollmentOperations getOperations() {
        return operations;
    }

    public void setOperations(EnrollmentOperations operations) {
        this.operations = operations;
    }

    public Course getCourse() {
        return course;
    }
}
