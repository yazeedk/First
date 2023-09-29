public interface EnrollmentOperations {
    void addStudent(Student student);
    void addCourse(Course course);
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void generateReports();
}
