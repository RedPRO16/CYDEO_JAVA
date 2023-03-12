package TaskByAdam;

public class PostIncrementOrDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);

        System.out.println(a++); // 5 // first do your job then next statement you can increment

        System.out.println(a); //6

        System.out.println(a--); //6 // first do your then for next statement yu can decrease the number

        System.out.println(a);


        int b=10;
        System.out.println(b++ + b-- +b); //10  //11 //10
    }
}
