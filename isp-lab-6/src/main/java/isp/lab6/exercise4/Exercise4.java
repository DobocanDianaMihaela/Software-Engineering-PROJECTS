package isp.lab6.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private Card card;
    private String owner;
    private double balance;
    public Account(Card card,String owner,double balance){


        this.card=card;
        this.owner=owner;
        this.balance=balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

}
 class Atm {
    private Bank bank;
    private Card card;

    public Atm(Bank bank,Card card){


        this.bank=bank;
        this.card=card;
    }
    public void changePin(String oldPin, String newPin){

        if(oldPin.equals(this.bank.getAccountByCardld(this.card.getCardld()).getCard().getPin()))
            this.bank.getAccountByCardld(this.card.getCardld()).getCard().setPin(newPin);

        else System.out.println("Old PIN incorrect");

    }


    public boolean insertCard(Card card, String pin){
        if (pin.equals(card.getPin())) {
            this.card=card;
            return true;
        }
        return false;
    }
    public void removeCard(){
        this.card=null;
    }

    public Transaction createTransaction1(){
        return new ChangePin();
    }
    public Transaction createTransaction2(){
        return new WithdrawMoney();
    }
    public Transaction createTransaction3(){
        return new CheckMoney();
    }

    public void withdraw(double amount){

        this.bank.getAccountByCardld(this.card.getCardld()).setBalance(this.bank.getAccountByCardld(this.card.getCardld()).getBalance()-amount);

    }

    public void checkMoney(){
        double b=this.bank.getAccountByCardld(this.card.getCardld()).getBalance();
        System.out.println("Money: "+b);
    }}

class Bank {

    private List<Account> account=new ArrayList<Account>(10);

    public String executeTransaction(Transaction t){

        return t.execute();

    }
    public Account getAccountByCardld(String cardld){
        for(Account i:account)
        {
            if(i.getCard().getCardld().equals(cardld))
                return i;
        }
        return null;
    }
    public Bank(List<Account> account){
        this.account = account;


    }
}
class Card {
    private String cardld;
    private String pin;
    public String getCardld() {
        return cardld;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }
    public Card(String cardld,String pin){
        this.cardld=cardld;
        this.pin=pin;



    }
}
class ChangePin extends Transaction {
    private String oldPin;
    private String newPin;
    public  String execute(){
        return "Change your PIN";
    }
}
class CheckMoney extends Transaction {

    @Override
    public String execute() {
        return "Check Money";
    }
}
abstract class  Transaction {
    public abstract String execute();

}
class WithdrawMoney extends  Transaction {

    private double amount;

    @Override
    public String execute() {
        return "Whithdrawing......";
    }
}

public class Exercise4 {
    public static void main(String[] args) {
       List<Account> account=new ArrayList<Account>(10);
        Scanner s = new Scanner(System.in);
        Card card0=new Card("4767677","9998");
        Card card1=new Card("2242434","4534");
        Card card2=new Card("7574849","9584");

        account.add(new Account(card0,"Dobocan Diana",5000));
        account.add(new Account(card1,"Malinas Tersinio",5000));
        account.add(new Account(card2,"Maier Rebeca",5000));

        System.out.println("Card Id: ");
        String cardId=s.nextLine();
        Bank bt=new Bank(account);
        System.out.println("Welcome to Banca Transilvania: "+bt.getAccountByCardld(cardId).getOwner());
        Atm atm=new Atm(bt,bt.getAccountByCardld(cardId).getCard());
        for(int j=0;j<3;j++){
            System.out.println("Pin: ");
            String pin=s.nextLine();

            if(atm.insertCard(bt.getAccountByCardld(cardId).getCard(),pin)){
                while(true){

                    System.out.println("");
                    System.out.println("Check Money, Enter 1");
                    System.out.println("Withdraw Money, Enter 2");
                    System.out.println("Change Pin, Enter 3");
                    System.out.println("To Exit, Enter 0");

                    System.out.println();
                    System.out.println("Enter choice::");
                    Scanner scan = new Scanner(System.in);
                    int choice = scan .nextInt();

                    switch(choice){
                        case 1: System.out.println("Your Account balance is: ");

                            System.out.println(bt.getAccountByCardld(cardId).getBalance());



                            break;
                        case 2: System.out.println("Enter the amount to be withdrawn. Available denominations are 1. 100, 2. 200, 3. 500, 4. 1000");
                            Scanner sc = new Scanner(System.in);
                            int amount = sc.nextInt();
                            atm.withdraw(amount);
                            System.out.println("New Balance: "+bt.getAccountByCardld(cardId).getBalance());

                            break;
                        case 3:
                            Scanner scann = new Scanner(System.in);
                            System.out.println("Insert the new PIN: ");
                            String newPin=scann.nextLine();
                            System.out.println("Insert the old PIN: ");
                            String oldPin=scann.nextLine();
                            atm.createTransaction1().execute();
                            atm.changePin(oldPin,newPin);
                            System.out.println("Your new PIN is:  "+bt.getAccountByCardld(cardId).getCard().getPin());




                            break;

                        case 0:
                            System.out.println("Thank you for using BT.");
                            System.exit(0);
                    }
                }
            }else System.out.println("Your Pin is wrong. You have: "+(3-1-j)+"  more attempts ");

        }






    }
}
