import java.util.ArrayList;
import java.util.List;

public class University implements EnrollmentOperations{
    private final List<Student> students;
    private final List<Course> courses;

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void generateAllAvailableCoursesReport() {
        System.out.println("All Available Courses Report:");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.getCourseCode() + ", Title: " + course.getTitle());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void enrollStudent(Student student, Course course) {

    }

    @Override
    public void dropStudent(Student student, Course course) {

    }

    @Override
    public void generateReports() {

    }

    public void enrollStudentInCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            student.enrollInCourse(course);
        } else {
            System.out.println("Error: Student or Course not found.");
        }
    }

    public void dropStudentFromCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            student.dropCourse(course);
        } else {
            System.out.println("Error: Student or Course not found.");
        }
    }

    public void generateStudentReport(Student student) {
        System.out.println("Report for Student " + student.getStudentID() + " - " + student.getName());
        for (Course course : student.getEnrolledCourses()) {
            System.out.println("Enrolled in Course: " + course.getCourseCode() + " - " + course.getTitle());
        }
        System.out.println("-----------------------");
    }

    public void generateCourseReport(Course course) {
        System.out.println("Report for Course " + course.getCourseCode() + " - " + course.getTitle());
        for (Student student : students) {
            if (student.isEnrolledInCourse(course)) {
                System.out.println("Student ID: " + student.getStudentID() + ", Name: " + student.getName());
            }
        }
        System.out.println("-----------------------");
    }
}















