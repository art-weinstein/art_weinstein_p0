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
        System.out.println("Personal funds");
        System.out.println(bankAccount.funds);
        System.out.println("Checking Account");
        System.out.println(bankAccount.checking);
        System.out.println("Savings");
        System.out.println(bankAccount.savings);
//
//        System.out.println("What would you like to do?");
//        System.out.println("'1' to transfer from funds to checking");
//        System.out.println("'2' to transfer from funds to savings");
//        System.out.println("'3' to transfer from checking to savings");
//        System.out.println("'4' to transfer from savings to checking");
//        System.out.println("'5' to withdraw from savings");
//        System.out.println("'6' to withdraw from checking");
//        System.out.println("'7' log out");
//        int command = scan.nextInt();

//        System.out.println(bankAccount.command());
//        String command = scan.nextLine();


//        System.out.println(bankAccount.command());
        while (bankAccount.command() != 7) {
            int command = scan.nextInt();
            if (command == 1) {
                System.out.println(bankAccount.transferFundsToChecking());
//                System.out.println(bankAccount.command());
            } else if (command == 7) {
                System.out.println(bankAccount.logOut());
                break;
            } else {
                System.out.println("additional features go here");
                break;
            }

        }
    }
}
