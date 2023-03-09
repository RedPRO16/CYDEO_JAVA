package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println( num1 < 0); //false
        System.out.println( num2 <0 ); //true
        System.out.println("...................");

        int a =5;
        ++a; //pre increment: increase the value by 1 right away
        System.out.println(a);  //6

        --a; //pre decrease: decrease the value by 1 right away
        System.out.println(a);  //5

        int c = 100;
        System.out.println(c++); // post increment: first passes the current value, then increase the value 1
        System.out.println(c); // 101

        System.out.println("..............................");

        int z = 45;

        System.out.println( ++z );  //46 , z=46
        System.out.println(z++); //46 , z=47
        System.out.println(z); //47
    }
}


/*
Unary Operators:
	++: increase the value by 1.
	-- : decreases the value by 1.

	Post vs Pre:
		Pre : changes the value immediately
				++ a
				-- a

		post: changes the value in the second step.
				a ++
				a --

 */