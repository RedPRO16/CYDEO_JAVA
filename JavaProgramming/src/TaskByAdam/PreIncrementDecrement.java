package TaskByAdam;

public class PreIncrementDecrement {
    public static void main(String[] args) {
        int a = 10;

        int b= ++a;  //11 // first increase the value then you can do your job later
        System.out.println(b); //11

        int c=--b; //10
        System.out.println(b--);//10
        System.out.println("b="+b); //9

        System.out.println(c);//10


    }
}
