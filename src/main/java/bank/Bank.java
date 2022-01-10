package main.java.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the bank! Please register an account.");


        System.out.println("Enter a name");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("Enter a password");
        String password = scan.nextLine();
        System.out.println(password);


        int authentication = 1;
        while (authentication == 1) {
        System.out.println("Please log in using your credentials.");
        System.out.println("Username");
        String nameInput = scan.nextLine();
        System.out.println("Password");
        String passwordInput = scan.nextLine();
            if (name.equals(nameInput) && password.equals(passwordInput)) {
                authentication = 0;
                System.out.println("Welcome " + name);
            } else {
                authentication = 1;
                System.out.println("Please enter a valid username or password");
            }
        }
    }
}

