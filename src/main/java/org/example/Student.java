package org.example;

public class Student extends Person {

    private String program;

    public Student(String id, String name, String program) {
        super(id, name);
        this.program = program;
    }

    // Getter: Retrieves the current program
    public String getProgram() {
        return program;
    }

    // Setter: Updates the program (The "Correct" way)
    public void setProgram(String program) {
        if (program != null && !program.isEmpty()) {
            this.program = program;
        } else {
            System.out.println("Error: Program name cannot be empty.");
        }
    }
}