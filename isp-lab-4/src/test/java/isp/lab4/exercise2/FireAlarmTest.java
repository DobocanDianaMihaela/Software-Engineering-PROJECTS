package isp.lab4.exercise2;


import junit.framework.TestCase;

public class FireAlarmTest extends TestCase {
    public FireAlarm alarm;
    public void setUp(){
        alarm = new FireAlarm(true);

    }

    public void testIsActive(){
        assertEquals(true,alarm.isActive());
    }


}
