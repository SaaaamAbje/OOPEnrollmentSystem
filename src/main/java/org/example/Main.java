package org.example;

public class Main {

    public static void main(String[] args) {


        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();



        Student s1 = new Student("24-001", "Sam Abjelina", "Information Technology");
        Student s2 = new Student("24-002", "John Doe", "Information Technology");


        System.out.println("--- Executing Tasks ---");
        s1.mainTask();
        s2.mainTask();
        System.out.println("-----------------------\n");


        studentReg.saveStudent(s1);
        studentReg.saveStudent(s2);


        Course c1 = new Course("100183", "Integrative Programming", "IT");
        courseReg.save(c1);

        studentReg.displayAllStudents();
        courseReg.displayAll();


        TuitionFeePayment payment = new TuitionFeePayment();


        double totalFee = payment.calculateTuitionFee(18, 0);

        System.out.println("\n--- Payment Summary ---");
        System.out.println("Student: " + s1.getPersonName());
        System.out.println("Total Tuition Fee: " + totalFee);


        System.out.println("Current Balance: " + payment.getRemainingBalance());
    }
}