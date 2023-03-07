package isp.lab9.exercise2;

import java.util.Random;

public class HumiditySensor extends Observable {
    public void readSensor() {
        Random random = new Random();
        int value = random.nextInt(50);
        this.changeState(new Sensor(SensorType.HUMIDITY,value));
    }

}
