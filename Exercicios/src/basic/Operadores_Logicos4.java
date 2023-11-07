package basic;

import java.util.Scanner;

public class Operadores_Logicos4 {
    public static void main(String[] args) {
        //OPERADORES LÓGICOS
        // && = E
        // || = OU
        // ! = NÃO


        int a = 5;
        int b = 10;

        if (a <= b && b == 10){
            System.out.println("Esse é verdadeiro");
        } else {
            System.out.println("Essa é falso");
        }

        //if (a)


        System.out.println(a < 10 && a == 5);//TRUE
        System.out.println(b > 20 && a == 10);//FALSE


    }
}
