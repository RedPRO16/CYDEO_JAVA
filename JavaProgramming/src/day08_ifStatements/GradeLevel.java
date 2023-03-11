package day08_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade =12;

        boolean elementary = grade>=1 && grade<=5;
        boolean middle = grade>=6 && grade<=8;
        boolean high = grade>=9 && grade<=12;
        boolean college = grade>=13 && grade<=16;
        boolean grad = grade>=17 && grade<=18;

       if(elementary){
           System.out.println("Elementary School");
       }
        if(middle){
            System.out.println("Middle School");
        }
        if(high){
            System.out.println("High School");
        }
        if(college){
            System.out.println("College School");
        }
        if(grad){
            System.out.println("Grad School");
        }
    }
}


/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18

 */