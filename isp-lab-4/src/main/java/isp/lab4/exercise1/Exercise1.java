package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor t1= new TemperatureSensor(30,"Cluj");
        System.out.println("Temperatura in "+t1.getLocation()+" este "+t1.getValue());



    }
}
