package basic.OO.desafio1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = scanner.nextInt();
        System.out.println("Enter account holder: ");
        String holder = scanner.nextLine();
        System.out.println("Is here an initial deposit?: ");
        char response = scanner.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial depoisut value:");
            double InitialDeposit = scanner.nextDouble();
            account = new Account(number, holder, InitialDeposit);
        } else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.withDraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

    }
}
