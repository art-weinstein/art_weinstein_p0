package main.java.bank;
import java.util.Scanner;

public class BankAccount {
   public static String name;
   public static String password;
   public double funds = 1000.00;
   public double savings = 0.00;
   public double checking = 0.00;


    public BankAccount() {
    }

    public Object validateAccount(String name, String password) {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);

        int validated = 0;
        while (validated == 0) {
            if (bankAccount.name.equals(name) && bankAccount.password.equals(password)) {
                return "Welcome " + bankAccount.name;
            } else {
                System.out.println("Account not found, Please log in using your credentials.");
                System.out.println("Username");
                name = scan.nextLine();
                System.out.println("Password");
                password = scan.nextLine();
            }
        }
        return null;
    }
        public String transferFundsToChecking() {
            Scanner scan = new Scanner(System.in);
            BankAccount bankAccount = new BankAccount();
            System.out.println("Enter an amount to transfer from personal funds to checking");
            double fundTransfer = scan.nextDouble();
            while (bankAccount.funds != 0) {
                if (fundTransfer <= bankAccount.funds) {
                    bankAccount.checking += fundTransfer;
                    bankAccount.funds -= fundTransfer;
                    return "Funds, " + bankAccount.funds + ", checking, " + bankAccount.checking;

                } else {
                    System.out.println("Insufficient funds, please enter a valid amount!");
                    System.out.println("Current funds:");
                    System.out.println(bankAccount.funds);
                    System.out.println("Current Checking");
                    System.out.println(bankAccount.checking);
                    fundTransfer = scan.nextDouble();
                }
            }
            return "Funds, " + bankAccount.funds + ", checking, " + bankAccount.checking + ", savings" + bankAccount.savings;
        }

        public int command(){
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("'1' to transfer from funds to checking");
            System.out.println("'2' to transfer from funds to savings");
            System.out.println("'3' to transfer from checking to savings");
            System.out.println("'4' to transfer from savings to checking");
            System.out.println("'5' to withdraw from savings");
            System.out.println("'6' to withdraw from checking");
            System.out.println("'7' log out");
            int command = scan.nextInt();
            return command;
        }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        BankAccount.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        BankAccount.password = password;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }
}