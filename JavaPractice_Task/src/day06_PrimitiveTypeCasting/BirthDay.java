package day06_PrimitiveTypeCasting;

public class BirthDay {
    public static void main(String[] args) {
        String name = "John";
        int birthDay = 25;
        String birtMonth = "April";
        int birthYear = 1995;

        System.out.println("name = " + name + " was born on " + birtMonth + "/" + birthDay + "/" + birthYear +".");

        double d1 = 20.5;
        short s1 = (short)d1;

        System.out.println(d1+" : "+s1);

        float f1 = 30.5F;
        long l1 = (long) f1;
        System.out.println("l1 = " + l1);
    }
}
/*
Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

			 		Primitives:

	double > float > long > int > short > byte

	smaller primitives can be directly assigned to larger primitive type
	larger primitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
 */
