package day10_NestedIfTernary;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';
        String result = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            if (grade == 'A') {
                result = grade + " : excellent";
            } else if (grade == 'B') {
                result = grade + " : great job";
            } else if (grade == 'C') {
                result = grade + " : good";
            } else if (grade == 'D') {
                result = grade + " : passed";
            } else {
                result = grade + " : failed";
            }

        } else {
            result = "Invalid grade";
        }
        System.out.println("result = " + result);
    }
}


/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */