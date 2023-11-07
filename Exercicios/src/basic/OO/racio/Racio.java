package basic.OO.racio;

import java.util.Scanner;

public class Racio {

    public static final double PI = 3.14;
    public static void main(String[] args) {
        //Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferencia %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
    }
}
