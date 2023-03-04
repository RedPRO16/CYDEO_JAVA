package day04;

public class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        int radius = 5;
        double area = radius * radius * PI;
        double perimeter = 2 * PI *radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
