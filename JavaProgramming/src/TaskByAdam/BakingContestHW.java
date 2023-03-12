package TaskByAdam;

public class BakingContestHW {
    public static void main(String[] args) {

        double sc1 = 8.5, sc2 = 7.9, sc3 = 8.3;
        double myScAvg = ((sc1 + sc2 + sc3) / 3), other1 = 8.5, other2 = 7.9;
        String result = "";

        if (myScAvg > other2 && myScAvg < other1) {
            result = "Second place";

        } else if (myScAvg < 7.9) {
            result = "Third place";

        } else {
            result = "First place";

        }
        System.out.println("Congratulations you earned " + result + " with a score of: " + myScAvg);

    }
}




/*
Task 8: BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and our cookies will be rated by 3 judges.

    Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
    Then also define two other people's final score and determine which place you earned int the baking contest

        you can earn either: First place, Second place, or Third place

        Ex:
            input:
                your score = 8.5, 7.9, 8.3
                other people score = 8.5 and 7.9

                output: Congratulations you earned Second place with a score of: 8.2
                    -> don't worry about decimal formatting
 */