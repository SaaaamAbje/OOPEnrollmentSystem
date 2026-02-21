package org.example;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courseList = new ArrayList<>();

    public void save(Course course) {
        courseList.add(course);
        System.out.println("Course added successfully.");
    }

    public void displayAll() {
        System.out.println("\n--- Registered Courses ---");
        for (Course c : courseList) {
            System.out.println("ID: " + c.getCourseID() + " | Name: " + c.getCourseName() + " | Program: " + c.getProgram());
        }
    }
}
