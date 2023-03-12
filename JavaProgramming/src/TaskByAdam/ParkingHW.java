package TaskByAdam;
//TODO HOMEWORK
public class ParkingHW {
    public static void main(String[] args) {
        int time = 8; // 0~24 hours
        double fee = 0 ;

        if(time>=0 && time<=24) {
            fee = (time >= 6 && time <= 12)? 7.5 : 15;

            System.out.println("Fee = " + fee);
        }else {
            System.out.println("Invalid Time");
        }
    }
}

/*
```
Task 7: Parking [ternary, relational]

    create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15
```
 */