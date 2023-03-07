package isp.lab4.exercise6;

import junit.framework.TestCase;

public class SalariedEmployeeTest extends TestCase {

    public SalariedEmployee e;
    public void setUp(){

        e =new SalariedEmployee("Delia","Santa",200);
    }
    public void testGetPaymentAmount(){

        assertEquals(45.0,e.getPaymentAmount());
    }
}
