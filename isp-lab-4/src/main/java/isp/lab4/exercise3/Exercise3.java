package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String[]args){
        TemperatureSensor a=new TemperatureSensor(20,"Cluj");
        FireAlarm b=new FireAlarm(true);
        Controler t1=new Controler(a,b);
        t1.controlStep();


    }
}
