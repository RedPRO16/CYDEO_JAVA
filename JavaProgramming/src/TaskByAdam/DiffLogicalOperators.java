package TaskByAdam;

public class DiffLogicalOperators {
    public static void main(String[] args) {
       int a =10;
        boolean value =(4>5)&&(a++==10);
        System.out.println("value = " + value);
        System.out.println("a = " +a);

        /*
        if you are using && operators if the first one is F we will not look at the second one.
         */
        System.out.println("---------------------------");

        int b=10;
        boolean valueOr=(4>3)|(--b==9);

        System.out.println("valueOr = " + valueOr);
        System.out.println("b = " + b);

    }
}
