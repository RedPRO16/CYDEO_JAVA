package day09_ifElseStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 85;
        String result = "";
        if (level > 90) {
            result = "Your tank is full";
        } else if (level > 80) {
            result = "Still ok";
        } else if (level > 70) {
            result = "Don't go too far";
        } else if (level > 60) {
            result = "Start to head back";
        } else {
            result = "Be careful now you at at 50%";
        }
        System.out.println("result = " + result);
    }
}
