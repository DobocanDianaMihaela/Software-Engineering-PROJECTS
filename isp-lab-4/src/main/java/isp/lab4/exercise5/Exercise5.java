package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;

public class Exercise5 {
    public static void main(String[]args){

        Controler t1=new Controler();
        House t2=new House(t1);
        t2.getControler();
        t2.getControler().controlStep();






    }
}
