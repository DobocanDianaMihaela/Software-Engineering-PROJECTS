package isp.lab5.exercise1;

public class Card {
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
