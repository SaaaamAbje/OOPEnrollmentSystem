package org.example;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        System.out.println("\n--- Registered Students ---");
        for (Student s : studentList) {
            System.out.println("ID: " + s.getStudentID() + " | Name: " + s.getStudentName() + " | Program: " + s.getProgram());
        }
    }

    // Methods for update and remove would typically search by ID
    public void removeStudent(String studentID) {
        studentList.removeIf(s -> s.getStudentID().equals(studentID));
        System.out.println("Student " + studentID + " removed.");
    }
}
