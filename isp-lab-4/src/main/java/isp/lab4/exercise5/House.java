package isp.lab4.exercise5;


import isp.lab4.exercise1.TemperatureSensor;

public class House {

    private Controler controler;

    public House(Controler controler)
    {
        this.controler=controler;


    }

    public Controler getControler() {
        return controler;
    }
}
