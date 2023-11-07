package basic.OO;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data");

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Quantity: ");
        int quantity = scanner.nextInt();

        Product producto = new Product(name, price, quantity);
        System.out.println(producto.toString());
    }

}
