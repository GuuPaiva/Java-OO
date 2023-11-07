package basic;

import java.util.Scanner;

public class IntroOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xA,xB,xC,yA,yB,yC;

        System.out.println("coloque os numeros X");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("coloque os numeros Y");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * ( p- xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * ( p- yB) * (p - yC));

        System.out.printf("A area do triangulo X é %.4f\n", areaX);
        System.out.printf("A area do triangulo Y é %.4f\n", areaY);


        if (areaX > areaY){
            System.out.println("Area do trianguhlo X");
        } else {
            System.out.println("Area do triango Y");
        }

    }
}
