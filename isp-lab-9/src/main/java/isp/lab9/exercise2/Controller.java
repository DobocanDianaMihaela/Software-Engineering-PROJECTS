package isp.lab9.exercise2;

public class Controller implements Observer{

    @Override
    public void update(Object event) {
        Sensor sensor=(Sensor) event;
        System.out.println("Sensor:"+sensor.getType()+"-> value:"+sensor.getValue());



    }
}