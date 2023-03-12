package day09_ifElseStatements;

public class BuyAlcohol {
    public static void main(String[] args) {
        int age = 19;
        if(age < 18){
            System.out.println(age+ " is not eligible for buying alcohol");
        }else {
            System.out.println(age+ " is eligible");
        }

    }
}
