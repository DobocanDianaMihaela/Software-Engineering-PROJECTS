package isp.lab6.exercise1;
import java.util.ArrayList;
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Test implementation here.");
        SensorReadingList s=new SensorReadingList();
        SensorReading s1=new SensorReading(20,"Cluj",Type.HUMIDITY);
        SensorReading s2=new SensorReading(3,"Aiud",Type.HUMIDITY);
        SensorReading s3=new SensorReading(30,"Bacau",Type.PRESSURE);
        SensorReading s4=new SensorReading(20,"Cluj",Type.HUMIDITY);
        s.addReading(s1);
        s.addReading(s2);
        s.addReading(s3);
        s.addReading(s4);

        System.out.println("Avarage of all readings for a specific sensor type and location: "+s.getAvarageValueByType(Type.HUMIDITY,"Cluj"));

        System.out.println("Return all readings for a specific type."+s.getReadingsByType(Type.HUMIDITY).toString());
        System.out.println("List all readings sorted by location (alphabetical).");
        s.listSortedByLocation();
        System.out.println("List all readings sorted by value;");
        s.listSortedByValue();
        System.out.println("Return all readings filtered by type and location."+s.findAllByLocationAndType("Cluj",Type.HUMIDITY).toString());
    }



}
