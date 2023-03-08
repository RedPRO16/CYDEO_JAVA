package TaskbyAdam;

public class YearsAndDays {
    public static void main(String[] args) {

        // create a variable for given minutes
        int givenMinutes=3456789;

        //need to find how many years in that minutes
        int howManyMinutesHaveInYears=60*24*365;

        System.out.println(givenMinutes / howManyMinutesHaveInYears);

        int years=givenMinutes / howManyMinutesHaveInYears;

        //we need to find how many days we left

        int leftMinutes = givenMinutes % howManyMinutesHaveInYears;

        int howManyMinutesWeHaveInADay=24*60;

        System.out.println(leftMinutes/howManyMinutesWeHaveInADay);

        int howManyDaysWeLeft=leftMinutes/howManyMinutesWeHaveInADay;
        System.out.println(givenMinutes + " minutes is approximately " + years+ " years and " +howManyDaysWeLeft+ " days");

    }
}


/*
write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */