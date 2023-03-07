package isp.lab6.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorReadingList implements IReadingRepository {

    private ArrayList<SensorReading> sensorList = new ArrayList<SensorReading>();

    @Override

    public void addReading(SensorReading reading) {

        sensorList.add(reading);

    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        int s = 0, k = 0;
        for (SensorReading i : sensorList) {
            if (type == i.getType() && location.equals(i.getLocation())) {
                s = s + i.getValue();
                k++;
            }

        }

        return (double) s / k;

    }


    @Override
    public List<SensorReading> getReadingsByType(Type type) {
        ArrayList<SensorReading> sensorList1 = new ArrayList<SensorReading>();
        for (SensorReading i : sensorList) {
            if (type == i.getType()) {
                sensorList1.add(i);

            }
        }
        return sensorList1;


    }

    @Override
    public void listSortedByLocation() {

        sensorList.sort((o1, o2) -> {

            return Integer.valueOf(o1.getLocation().compareTo(o2.getLocation()));
        });
        System.out.println(sensorList);
    }

    @Override
    public void listSortedByValue() {


        sensorList.sort(Comparator.comparing(SensorReading::getValue)
                .thenComparing(SensorReading::getValue));


        System.out.println(sensorList);


    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        ArrayList<SensorReading> sensorList1 = new ArrayList<SensorReading>();
        for (SensorReading i : sensorList) {
            if (type == i.getType() && location.equals(i.getLocation())) {
                sensorList1.add(i);

            }
        }
        return sensorList1;
    }
}
