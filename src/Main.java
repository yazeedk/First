public class Main {
    public static void main(String[] args) {
        // Creating a university
        University university = new University();

        // Adding students to the university
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        university.addStudent(student1);
        university.addStudent(student2);

        // Adding courses to the university
        Course mathCourse = new Course("MATH101", "Mathematics 101");
        Course physicsCourse = new Course("PHYS101", "Physics 101");
        university.addCourse(mathCourse);
        university.addCourse(physicsCourse);

        // Enrolling students in courses
        university.enrollStudentInCourse(student1, mathCourse);
        university.enrollStudentInCourse(student2, physicsCourse);

        // Generating reports
        university.generateStudentReport(student1);
        university.generateStudentReport(student2);

        // Generating report for all available courses
        university.generateAllAvailableCoursesReport();
    }
}
