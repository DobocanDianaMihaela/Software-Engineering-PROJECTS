package isp.lab6.exercise3;

import junit.framework.TestCase;

import java.util.ArrayList;

public class SensorTest extends TestCase {


    public Sensor sensor;
    public SensorReading s;
    public SensorReading sensor2;
    public SensorReading sensor3;
    public SensorReading sensor4;
    public ArrayList<SensorReading> readings;
    public void setUp(){
      readings = new ArrayList<>();
        sensor=new Sensor("22",SensorType.TEMP);
        sensor2=new SensorReading(23,90);
        sensor3=new SensorReading(23,90);
        sensor4=new SensorReading(24,90);
        s=new SensorReading(23,90);

        readings.add(sensor2);
        readings.add(sensor4);



    }

    public void testAddSensorReading(){assertTrue(sensor.addSensorReading(s));}
    public void testGetSensorReadingSortedByValue(){}
    public void testCompare(){assertEquals(0,sensor.compare(sensor2,sensor3));}
}
