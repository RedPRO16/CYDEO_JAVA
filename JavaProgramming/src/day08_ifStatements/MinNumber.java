package day08_ifStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100, n2= 200;

        boolean n1Min = n1<n2,
                n2Min = n2<n1,
                Equal = n1 == n2;
        if(n1Min){
            System.out.println(n1+ " is minimum.");
        }
        if(n2Min){
            System.out.println(n2+ " is minimum.");
        }
        if(Equal){
            System.out.println("Equal.");
        }


    }
}

/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */