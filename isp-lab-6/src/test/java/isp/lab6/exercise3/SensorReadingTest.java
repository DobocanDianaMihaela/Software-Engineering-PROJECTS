package isp.lab6.exercise3;

import junit.framework.TestCase;

public class SensorReadingTest  extends TestCase {

    public  SensorReading sensor;
    public  SensorReading s;

    public void setUp(){

      sensor=new SensorReading(25.0,90);
        s=new SensorReading(50.0,90);


    }

    public void testCompareTo(){assertEquals(-25,sensor.compareTo(s));}
}
