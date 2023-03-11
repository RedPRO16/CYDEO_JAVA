package day08_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=30, b=45, c=60;

        if((a<b && a>c) || (a>c && a<b)){
            System.out.println(a+ " is median number");
        }
        if((b>a && b<c || (b>c && a>b))){
            System.out.println(b+ " is median number");
        }
        if((a<c && c<b) || (c>b) && (c<a)){
            System.out.println(c+ " is median number");
        }



    }
}
 /*
 Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

  */