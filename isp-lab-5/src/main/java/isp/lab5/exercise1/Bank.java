package isp.lab5.exercise1;

public class Bank {

  private Account[] account =new Account[10];

  public String executeTransaction(Transaction t){

      return t.execute();

  }
  public Account getAccountByCardld(String cardld){
      for(int i=0;i<account.length;i++)
      {
          if(account[i].getCard().getCardld().equals(cardld))
              return account[i];
      }
      return null;
  }
  public Bank(Account[] account){
      for(int i=0;i<account.length;i++)
      {this.account[i]=account[i];

      }


  }
}
