package basic;

import java.util.Scanner;

public class EstruturaDoWHile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Faça-enquanto!!

        char resp;
        do { int f = 32;
            double c = 5.0/9.0;
            int faren = scanner.nextInt();
            double resultado = (faren - f) * c;
            System.out.println(resultado);
            resp = scanner.next().charAt(0);
        } while (resp != 'n');
    }
}


