package org.example;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public Course(String courseID, String courseName, String program) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    // Getters
    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() { // Added this - you'll likely need it!
        return courseName;
    }

    public String getProgram() {
        return program;
    }

    // Setters
    public void setCourseID(String courseID) { // Added for completeness
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProgram(String program) { // Renamed from setCourseProgram for consistency
        this.program = program;
    }
}
