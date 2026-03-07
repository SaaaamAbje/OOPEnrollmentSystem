package org.example;

public class Main {

    public static void main(String[] args) {

        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();


        Student s1 = new Student("24-001", "Sam Abjelina", "Discrete Mathematics");
        Student s2 = new Student("24-002", "John Doe", "Information Technology");


        s1.setName("Sam Abjelina");
        s1.setID("24-001");
        s1.setProgram("Information Technology");


        // 3. Save to "Database"
        studentReg.saveStudent(s1);
        studentReg.saveStudent(s2);

        // 4. Register a Course
        Course c1 = new Course("100183", "Integrative Programming", "IT");
        courseReg.save(c1);

        // 5. Display Information
        studentReg.displayAllStudents();
        courseReg.displayAll();

        // 6. Handle Payments
        TuitionFeePayment payment = new TuitionFeePayment();
        payment.calculateTuitionFee(18); // Assuming 18 units

        System.out.println("Balance: " + payment.calculateBalance());
        System.out.println("\nTotal Tuition Fee: " + payment.calculateBalance());
    }
}