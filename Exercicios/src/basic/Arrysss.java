package basic;

import java.sql.Array;
import java.util.List;
import java.util.Scanner;

public class Arrysss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i<n; i++){
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i= 0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("AVERAGE HEIGHT " + avg);
        scanner.close();
    }
}
