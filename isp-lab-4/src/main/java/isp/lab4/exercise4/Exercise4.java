package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise4 {
    public static void main(String[]args){
        TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];
        temperatureSensors[0]=new TemperatureSensor(20,"Cluj");
        temperatureSensors[1]=new TemperatureSensor(30,"Gherla");
        temperatureSensors[2]=new TemperatureSensor(30,"Bistrita");
        FireAlarm a=new FireAlarm(true);
        Controler t1=new Controler(temperatureSensors,a);
        t1.controlStep();






    }
}