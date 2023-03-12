package day09_ifElseStatements;

public class MaxTwoNum {
    public static void main(String[] args) {
        int n1 = 250, n2 = 350;
        if(n1>n2){  //n1 is max number
            System.out.println(n1+ " is max number");
        }
        if(n2>n1){ //n2 is max number
            System.out.println(n2+ " is max number");
        }
        if(n1==n2){ //n1=n2 equal
            System.out.println("Equal");
        }

    }
}
