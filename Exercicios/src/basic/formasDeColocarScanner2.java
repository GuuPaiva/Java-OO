package basic;

import java.util.Scanner;

public class formasDeColocarScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Formas de colocar o SCANNER, pode colocar em mais de um lugar.
        String s1, s2, s3;

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}
