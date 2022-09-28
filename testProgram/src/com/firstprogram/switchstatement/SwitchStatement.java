package com.firstprogram.switchstatement;

public class SwitchStatement {
    public static void main(String[] args) {
        // SWITCH STATEMENT
        String letterGrade = "aasdasd-";

        switch (letterGrade.toUpperCase()) {
            case "A":
                System.out.println("Grade: " + letterGrade.toUpperCase());
                break;
            case "A+":
                System.out.println("Grade: " + letterGrade.toUpperCase());
                break;
            case "A-":
                System.out.println("Grade: " + letterGrade.toUpperCase());
                break;
            default:
                System.out.println("Grade not met");
        }
    }
}
