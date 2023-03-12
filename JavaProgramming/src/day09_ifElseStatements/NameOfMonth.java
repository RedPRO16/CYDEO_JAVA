package day09_ifElseStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        int n = 9; //1~12
        String result = ""; // temporary
        if (n >= 1 && n <= 12) { //if number is valid (1~12)


            if (n == 1) {
                result = "January";
            } else if (n == 2) {
                result = "February";
            } else if (n == 3) {
                result = "March";
            } else if (n == 4) {
                result = "April";
            } else if (n == 5) {
                result = "May";
            } else if (n==6) {
                result = "June";
            } else if (n==7) {
                result = "July";
            } else if (n==8) {
                result = "August";
            } else if (n==9) {
                result ="September";
            } else if (n==10) {
                result = "October";
            } else if (n==11) {
                result="November";
            }else {
                result="December";
            }
        } else { //if number is not valid
            result = "Invalid Number";
        }

        System.out.println(result);
    }
}