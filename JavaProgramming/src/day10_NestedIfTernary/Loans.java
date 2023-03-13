package day10_NestedIfTernary;

public class Loans {
    public static void main(String[] args) {
        int salary = 70000, cscore = 660;
        String result = (salary > 60000 && cscore > 650) ? result = "Loan Approved"
                : "Loan Denied";

        System.out.println("result = " + result);
    }
}


/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */