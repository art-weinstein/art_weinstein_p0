package main.java.bank;
import java.util.Scanner;

public class BankApp {
    public BankApp() {
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the bank! Please register an account.");

        System.out.println("Enter a name");
        bankAccount.name = scan.nextLine();

        System.out.println("Enter a password");
        bankAccount.password = scan.nextLine();

        System.out.println("Please log in using your credentials.");
        System.out.println("Username");
        String name = scan.nextLine();
        System.out.println("Password");
        String password = scan.nextLine();

        String user = (String) bankAccount.validateAccount(name, password);
        System.out.println(user);
    }
}
