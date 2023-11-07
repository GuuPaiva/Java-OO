package basic;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //IF = SE
        //ELSE-IF = SENÃO SE
        //ELSE = SENÃO

        int X = 10;


        if (X >= 33) {
            System.out.println("Valor falso");
        } else if (X <= 33){
            System.out.println("Valor verdadeiro");
        }


        if (X <= 33) {
            System.out.println("Valor falso");
        } else if (X >= 33){
            System.out.println("Valor verdadeiro");
        }


        System.out.println("Que horas são? ");
        int hora;
        hora = scanner.nextInt();
        if (hora < 12){
            System.out.println("Bom dia!");
        } else if (hora == 12 || hora <= 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }


        int valor;
        System.out.println("Quanto voce consumiu?? ");
        valor = scanner.nextInt();
        if (valor == 22){
            System.out.println("Voce pagará R$50");
        } else if (valor == 103){
            System.out.println("Você pagará R$56");
        }
    }
}
