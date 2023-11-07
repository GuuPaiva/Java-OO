package basic;

public class Funcoes_Matematica3 {
    public static void main(String[] args) {

        double X = 3.0;
        double Y = 4.0;
        double Z = -5.0;
        double A, B, C;

        //RAIZ QUADRADA
        A = Math.sqrt(X);
        B = Math.sqrt(Y);
        C = Math.sqrt(25.0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        //POTENCIAÇÃO
        A = Math.pow(X, Y);
        B = Math.pow(X, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        //VALOR ABSOLUTO
        A = Math.abs(Y);
        B = Math.abs(Z);
        System.out.println(A);
        System.out.println(B);




    }
}
