package test.java.junittesting;
import static org.junit.jupiter.api.Assertions.*;
import main.java.bank.Bank;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class bankTest {
    Scanner scan = new Scanner(System.in);
    static Bank bank1;

    @BeforeAll
    public static void setUp(){
        System.out.println("Initialization before tests run");
    }
    @BeforeEach
    public void before(){
        System.out.println("Run next test");
    }

    @Test
    public void name(){
        String name = "art";
        assertEquals("art", name);
    }
    @Test
    public void password(){
        String password = "password";
        assertEquals("password", password);
    }


}
