package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {

    private TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];
    private FireAlarm fireAlarm;
    int ok=0;
    public Controler() {

        this.temperatureSensors[0]=new TemperatureSensor(20,"Cluj");
        this.temperatureSensors[1]=new TemperatureSensor(60,"Gherla");
        this.temperatureSensors[2]=new TemperatureSensor(90,"Bistrita");
        this.fireAlarm= new FireAlarm(true);
    }
    public void controlStep(){
        for (int i = 0; i < 3; i++)
            if (temperatureSensors[i].getValue() >50) ok=1;
        if(ok==1)
        {fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }

        else System.out.println("Fire alarm not started");

    }

    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }
}





