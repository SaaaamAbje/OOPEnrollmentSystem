package org.example;

public class Main {
    public static void main(String[] args) {
        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();

        Student s1 = new Student("24-001", "Sam Abjelina", "Discrete Mathematics");
        Student s2 = new Student("24-001", "John Doe", "Information Technology");
        studentReg.saveStudent(s1);
        studentReg.saveStudent(s2);

        Course c1 = new Course("100183", "Integrative Programming", "IT");
        courseReg.save(c1);

        studentReg.displayAllStudents();
        courseReg.displayAll();
    }
}