package isp.lab5.exercise1;

import junit.framework.TestCase;

public class BankTest extends TestCase {
    public Account[] account;
    public Bank bank;
    public Card card0;

    public void setUp() {
        card0 = new Card("123869U5", "4966");

        account = new Account[10];
        account[0]=new Account(card0,"Dobocan Diana",5000);


        bank = new Bank(account);
    }

    public void testGetAccountByCardId(){
        assertEquals(account[0],bank.getAccountByCardld("123869U5"));
    }
}
