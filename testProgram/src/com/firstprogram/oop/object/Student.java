package com.firstprogram.oop.object;

public class Student {
    // PROPERTIES
    String fullName;
    String section;
    String studentNumber;
    String email;
    String contactNumber;

    // CONSTRUCTOR
    public Student(String fullName, String section, String studentNumber,
                              String email, String contactNumber) {
        this.fullName = fullName;
        this.section = section;
        this.studentNumber = studentNumber;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // METHODS
    public void studentInformation() {
        System.out.println("Fullname: " + this.fullName);
        System.out.println("Section: " + this.section);
        System.out.println("Number: " + this.studentNumber);
        System.out.println("email: " + this.email);
        System.out.println("Contact: " + this.contactNumber);
    }

    public void studentContact() {
        System.out.println("Fullname: " + this.fullName);
        System.out.println("email: " + this.email);
        System.out.println("Contact Number: " + this.contactNumber);
    }

    public void message() {
        System.out.println("test method");
    }
}
