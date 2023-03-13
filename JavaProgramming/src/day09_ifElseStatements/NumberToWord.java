package day09_ifElseStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 9; // 0~9 mus in range
        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three" : (number == 4) ? "Four"
                        : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine"
                : "Invalid Number";
        System.out.println("Result " + number + " = " + result);
    }
}
