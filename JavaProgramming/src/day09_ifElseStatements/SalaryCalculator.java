package day09_ifElseStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 180_000;
        double tax = 0;
        Boolean isMarried = true; //single or married

        if (salary >= 130000) {
            tax = 0.35; //35%
        } else if (salary >= 100000) {
            tax = 0.30;
        } else if (salary >= 80000) {
            tax = 0.25;
        } else {
            tax = 0.20;
        }

        if (isMarried) {
            tax -= 0.05; //5% extra discount
        }
        double salaryAfterTax = salary - (salary * tax);

        System.out.println("salary after tax = " + salaryAfterTax);
    }
}

/*
 Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */