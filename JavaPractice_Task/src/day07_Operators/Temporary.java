package day07_Operators;

public class Temporary {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int x = a;
        a = b;
        b = x;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

/*
 write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */