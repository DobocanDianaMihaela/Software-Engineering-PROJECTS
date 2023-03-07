package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

import junit.framework.TestCase;

public class ControlerTest extends TestCase {


    public TemperatureSensor[] temperatureSensors;
    public FireAlarm alarm;
    public Controler controler;
    public void setUp(){
        temperatureSensors = new TemperatureSensor[3];
        temperatureSensors[0]=new TemperatureSensor(20,"Cluj");
        temperatureSensors[1]=new TemperatureSensor(30,"Gherla");
        temperatureSensors[2]=new TemperatureSensor(30,"Bistrita");
        alarm=new FireAlarm(false);
        controler = new Controler(temperatureSensors,alarm);

    }
    public void testControlStep(){
        controler.controlStep();
        assertFalse(alarm.isActive());

    }


}
