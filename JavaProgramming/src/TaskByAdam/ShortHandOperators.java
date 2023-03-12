package TaskByAdam;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 10;
        int result = a + 10;

        a = a + 10; //20
        System.out.println(a);

        int b = 0;
        b += 10; //b=b+10
        System.out.println("b = " + b);

        b*= 2; //20
        System.out.println("b after multiply 2 = " + b);

        b/=4; //5
        System.out.println("b after divide 4 = " + b);

        b-=5;
        System.out.println("b after subtraction = " + b);



    }
}
