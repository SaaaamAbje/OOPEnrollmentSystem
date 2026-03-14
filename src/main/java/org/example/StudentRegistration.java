package org.example;

import java.util.ArrayList;

public class StudentRegistration {


    private final ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        System.out.println("\n--- Registered Students ---");

        for (Student s : studentList) {
            // Updated to match the Person class method names
            System.out.println(
                    "ID: " + s.getPersonID() +
                            " | Name: " + s.getPersonName() +
                            " | Program: " + s.getProgram()
            );
        }
    }
}