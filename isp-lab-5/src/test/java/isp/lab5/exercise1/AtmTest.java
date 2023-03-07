package isp.lab5.exercise1;

import junit.framework.TestCase;

public class AtmTest extends TestCase {
    public Account[] account;
    public Bank bank;
    public Card card0;
    public Atm atm;

    public void setUp(){
         card0=new Card("4767677","9998");


        account=new Account[10];
        account[0]=new Account(card0,"Dobocan Diana",5000);


        bank=new Bank(account);
        atm = new Atm(bank,card0);

    }

    public void testChangePin(){
        atm.changePin("9998","1111");
        assertEquals("1111",bank.getAccountByCardld(card0.getCardld()).getCard().getPin());
    }

    public void testWithdraw(){
        atm.withdraw(100);
        assertEquals(4900.0,bank.getAccountByCardld(card0.getCardld()).getBalance());
    }

    public void testInsertCard(){
        assertTrue(atm.insertCard(card0,"9998"));
    }


}