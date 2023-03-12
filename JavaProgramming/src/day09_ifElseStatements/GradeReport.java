package day09_ifElseStatements;

public class GradeReport {
    public static void main(String[] args) {
         int score = 95; // 0 ~ 100
        boolean A = score >= 90 && score <=100,
                B = score >= 80 && score <=89,
                    //score >=80 && !A;
                C = score >= 70 && score <=79,
                    //score >=70 && !A &&!B
                D = score >= 60 && score <=69,
                    //score >=60 && !A && !B && !C
                F = score >= 0 && score <=59;
                    // !A && !B && !C && !D
        if(A){
            System.out.println("Excellent");
        }
        if(B){
            System.out.println("Great");
        }
        if(C){
            System.out.println("Good");
        }
        if(D){
            System.out.println("Passed");
        }
        if(F){
            System.out.println("Failed");
        }

    }
}
