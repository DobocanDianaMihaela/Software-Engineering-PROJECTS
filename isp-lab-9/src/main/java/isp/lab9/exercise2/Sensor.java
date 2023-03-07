package isp.lab9.exercise2;

public class Sensor {
    private SensorType type;
    private int value;

    public Sensor(SensorType type,int value){

        this.type=type;
        this.value=value;
    }

    public SensorType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
