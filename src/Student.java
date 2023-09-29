import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private String email;
    private List<Course> enrolledCourses;



    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }


    public boolean isEnrolledInCourse(Course course) {
        for (Course enrolledCourse : enrolledCourses) {
            // Assuming getCourseCode() returns the course code of the course object
            if (enrolledCourse.getCourseCode().equals(course.getCourseCode())) {
                return true; // Student is enrolled in the specified course
            }
        }
        return false; // Student is not enrolled in the specified course
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
