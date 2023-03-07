/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise2;

/**
 *
 * @author Admin
 */
public class Exercise2 {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("It works!");

        TemperatureSensor temperatureSensor=new TemperatureSensor();
        HumiditySensor humiditySensor=new HumiditySensor();
        PressureSensor pressureSensor=new PressureSensor();
        Controller controller=new Controller();
        temperatureSensor.register(controller);
        humiditySensor.register(controller);
        pressureSensor.register(controller);
        temperatureSensor.readSensor();
        Thread.sleep(500);
        humiditySensor.readSensor();
        Thread.sleep(500);
        pressureSensor.readSensor();
        Thread.sleep(500);
    }
}
