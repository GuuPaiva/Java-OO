package basic;

import java.util.Scanner;

public class EstruturaRepetitivaFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //FOR, estrutura de controle que repete um bloco de comandos para um certo intervalo de valores

        //FOR com SCANNER
        int ia;
        ia = scanner.nextInt();
        for (int i = 0; ia > i; i++){
            System.out.println("I " + i);
        }

        //FOR sem Scanner.
        for (int b = 0; b < 10; b++){
            System.out.println("E" + b);
        }
    }
}
