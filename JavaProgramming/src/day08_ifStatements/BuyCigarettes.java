package day08_ifStatements;

public class BuyCigarettes {
    public static void main(String[] args) {
        int age = 17;
        boolean eligible = age >= 18;

        if(eligible){
            System.out.println(age+ " is eligible to buy Cigarettes. ");
        }
        if (!eligible){
            System.out.println(age+ " not eligible.");
        }
    }
}

/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */