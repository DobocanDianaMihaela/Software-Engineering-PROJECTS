package isp.lab6.exercise3;

import junit.framework.TestCase;

import java.util.ArrayList;

public class SensorClusterTest  extends TestCase {
public  SensorCluster sensor;


public void setUp(){

  sensor=new SensorCluster();
  sensor.addSensor("2",SensorType.TEMP);
  sensor.writeSensorReading("2",5,90);


}
public void testWriteSensorReading(){assertTrue(sensor.writeSensorReading("2",3,80));}
    public void testAddSensor(){assertNull(sensor.addSensor("2",SensorType.TEMP));}

    public void testGetSensorById(){
        Sensor s = sensor.addSensor("1",SensorType.TEMP );


        Sensor ss = sensor.getSensorById("1");
        assertEquals(s,ss);}


}
