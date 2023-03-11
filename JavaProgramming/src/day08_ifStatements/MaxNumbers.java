package day08_ifStatements;

public class MaxNumbers {
    public static void main(String[] args) {
        int n1 = 80,
            n2 = 200;

        boolean n1Max = n1 > n2;
        boolean n2Max = n2 > n1;
        boolean equal = n1 == n2;

        if(n1Max){
            System.out.println(n1+ " is maximum");
        }

        if(n2Max){
            System.out.println(n2+ " is maximum");
        }
        if(equal){
            System.out.println("Equal");
        }



    }
}

/*
Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */