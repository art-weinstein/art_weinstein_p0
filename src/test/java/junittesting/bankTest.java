package test.java.junittesting;
import static org.junit.jupiter.api.Assertions.*;
import main.java.bank.BankAccount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class bankTest {
    Scanner scan = new Scanner(System.in);
    static BankAccount bankAccount1;

    @BeforeAll
    public static void setUp(){
        System.out.println("Initialization before tests run");
        bankAccount1 = new BankAccount(){
        };
    }
    @BeforeEach
    public void before(){
        System.out.println("Run next test");
    }


    @Test
    public void getName(){String name = "art";
       bankAccount1 = new BankAccount();
       bankAccount1.name = name;
       bankAccount1.getName();
       assertEquals("art", bankAccount1.getName());
    }

//    @Test
//    public void validateAccount(){
//       bankAccount1.getName();
//       assertEquals("Art", bankAccount1.getName());
//
//    }

    @Test
    public void password(){
        String password = "password";
        assertEquals("password", password);
    }


}
