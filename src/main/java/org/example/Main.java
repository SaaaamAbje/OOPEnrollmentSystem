package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("24-001", "Sam Abjelina", "Discrete Mathematics");

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());

        System.out.println("---------------------------");


        Student student2 = new Student("24-002", "John Doe", "Information Technology");

        System.out.println("Student ID: " + student2.getStudentID());
        System.out.println("Student Name: " + student2.getStudentName());
        System.out.println("Program: " + student2.getProgram());

        System.out.println("---------------------------");

        Course course = new Course("100183", "Information Management", "IT");

        System.out.println("Course ID: " + course.getCourseID());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Program: " + course.getProgram());
    }
}