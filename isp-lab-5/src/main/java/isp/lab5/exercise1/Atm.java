package isp.lab5.exercise1;

public class Atm {
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
}

}
