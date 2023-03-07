package isp.lab4.exercise3;


import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import junit.framework.TestCase;

public class ControlerTest extends TestCase {

    public Controler controler;
    public TemperatureSensor sensor;
    public FireAlarm alarm;
    public void setUp(){
        alarm=new FireAlarm(false);
        sensor=new TemperatureSensor(55,"Cluj");
        controler = new Controler(sensor,alarm);

    }
    public void testControlStep(){
        controler.controlStep();
        assertTrue(alarm.isActive());

    }
}
