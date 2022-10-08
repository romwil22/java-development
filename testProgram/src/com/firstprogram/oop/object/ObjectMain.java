package com.firstprogram.oop.object;

public class ObjectMain {
    public static void main(String[] args) {
        Student student1 = new Student("romwil pilapil","5-1d",
                "2017-0012-MN-0","romwil.pilapil@gmail.com","09919428612");

        student1.message();
        System.out.println();

        System.out.println("Student Information:");
        student1.studentInformation();
        System.out.println();
        
        System.out.println("Student Contact:");
        student1.studentContact();
    }
}
