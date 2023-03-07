package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum SensorType{
    TEMP, PRES;
}
/////////////////////////////////////////
class SensorReading implements Comparable<SensorReading>{
    double value;
    long dateAndTime;

    public SensorReading(double value, long dateAndTime) {
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    @Override
    public int compareTo(SensorReading o) {
       return (int)(value-o.value);
    }
}
/////////////////////////////////////////
class Sensor implements Comparator<SensorReading> {
    ArrayList<SensorReading> readings = new ArrayList<>();
    String id;
    SensorType type;

    public Sensor(String id, SensorType type) {
        this.id = id;
        this.type = type;
    }

    public boolean addSensorReading(SensorReading reading){
        readings.add(reading);
        return true;
    }
    List<SensorReading> getSensorReadingSortedByValue(){
        Collections.sort(readings); //aceasta metoda utilizeaaz criteriul definiti in compareTo din clasa SensorReading)
        return readings;
    }
    List<SensorReading> getSensorReadingSortedByDate(Sensor s){
        Collections.sort(readings,s); //aceasta metoda utilizeaaz criteriul definiti in compareTo din clasa SensorReading)
        return readings;
    }
    public int compare(SensorReading x,SensorReading y){
        if(x.dateAndTime==y.dateAndTime) return 0;
        else if(x.dateAndTime>y.dateAndTime) return 1;
        else return -1;


}}
/////////////////////////////////////////
class SensorCluster{
    ArrayList<Sensor> sensors = new ArrayList<>();


    public Sensor addSensor(String id, SensorType type){
        if (this.sensors == null) {
            sensors = new ArrayList<>();
        }
        for(Sensor s: this.sensors) {
            if (s.id.equals(id)) return null;
        }
        Sensor sensor = new Sensor(id, type);
        this.sensors.add(sensor);
        return sensor;
    }

    public boolean writeSensorReading(String id, double value, long dtaeTime){
        for(Sensor s: sensors){
            if(s.id.equals(id)){
                s.addSensorReading(new SensorReading(value,dtaeTime));
            }
           else  return false;
        }
        return true;
    }

    public Sensor getSensorById(String id){
        return sensors.stream().filter(s -> s.id==id).findFirst().get();
    }

}
/////////////////////////////////////////
public class Exercise3 {

    public static void main(String[] args) {
        SensorCluster c = new SensorCluster();

        c.addSensor("1",SensorType.TEMP);
        Sensor s2=c.addSensor("1",SensorType.TEMP);

        System.out.println("Sensor with given id already exists => "+ s2);

        c.writeSensorReading("1",8,9);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);
        System.out.println( "Sensor cannot be found...This sensor Id doesn't EXIST ..."+c.writeSensorReading("2",8,9));

        Sensor s1 = c.getSensorById("1");
         System.out.println("Sorted by date and time:");
        List<SensorReading> rez = s1.getSensorReadingSortedByDate(s1);
        rez.stream().forEach(s -> System.out.println(s.dateAndTime));
        System.out.println("Sorted by value:");
        List<SensorReading> rez1 = s1.getSensorReadingSortedByValue();
        rez1.stream().forEach(s -> System.out.println(s.value));

        //////////
//        for(SensorReading s: rez){
//            System.out.println(s.value);
//        }


    }
}
