package basic;

public class Teste_Variaveis1 {
    public static void main(String[] args) {


        //Variáveis STRING
        String product1 = "Computer";
        String product2 = "Office desk";

        //Variáveis INTEIRO
        int age = 30;
        int code = 5290;

        //Variáveis do tipo chat são usadas para colocar uma determinada letra.
        char gender = 'F';

        //Variáveis do tipo com ponto flutuante.
        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;


        //SOUTF, basicamente, coloca todas as váriaveis em forma de texto, ficando mais fácil o entendimento.
        //SOUT, usada como quebra de linha.
        System.out.println("Products: ");
        System.out.printf("%s, which price is %.2f\n", product1,price1 );
        System.out.printf("%s, which price is %.2f\n", product2, price2);
        System.out.printf("Record: %d, code %d and gender: %s", age, code, gender);


    }
}
