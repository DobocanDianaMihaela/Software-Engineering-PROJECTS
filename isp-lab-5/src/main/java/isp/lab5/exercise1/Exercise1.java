package isp.lab5.exercise1;


import java.util.ArrayList;
import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Card card0=new Card("4767677","9998");
        Card card1=new Card("2242434","4534");
        Card card2=new Card("7574849","9584");
        Account [] account=new Account[10];
        account[0]=new Account(card0,"Dobocan Diana",5000);
        account[1]=new Account(card1,"Malinas Tersinio",5000);
        account[2]=new Account(card2,"Maier Rebeca",5000);

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
