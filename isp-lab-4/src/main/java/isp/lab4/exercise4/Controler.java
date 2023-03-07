package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {

    int ok = 1;
    private TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];
    private FireAlarm fireAlarm;

    public Controler(TemperatureSensor temperatureSensor[], FireAlarm fireAlarm) {
        for (int i = 0; i < 3; i++) {

            this.temperatureSensors[i] = temperatureSensor[i];
        }
        this.fireAlarm = fireAlarm;



    }

    public void controlStep() {
        for (int i = 0; i < 3; i++)
            if (temperatureSensors[i].getValue() < 50) ok = 0;
        if (ok == 1) {
            fireAlarm.setActive(true);

            System.out.println("Fire alarm started");
        } else System.out.println("Fire alarm not started");

    }

}
