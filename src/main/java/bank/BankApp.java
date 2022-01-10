package main.java.bank;
import java.util.Scanner;

public class BankApp {
    public BankApp(){}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Welcome to the bank! Please register an account.");

        System.out.println("Enter a name");
        bankAccount.name = scan.nextLine();
        System.out.println(bankAccount.name);

        System.out.println("Enter a password");
        bankAccount.password = scan.nextLine();
        System.out.println(bankAccount.password);


        int authentication = 1;
        while (authentication == 1) {
        System.out.println("Please log in using your credentials.");
        System.out.println("Username");
        String nameInput = scan.nextLine();
        System.out.println("Password");
        String passwordInput = scan.nextLine();
            if (bankAccount.name.equals(nameInput) && bankAccount.password.equals(passwordInput)) {
                authentication = 0;
                System.out.println("Welcome " + bankAccount.name);
            } else {
                authentication = 1;
                System.out.println("Please enter a valid username or password");
            }
        }

    }
}
