package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.ParkingAccessFileControl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.io.Writer;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.google.gson.Gson;
import  java.io.FileWriter;

public class CarParkingAccessApp {
    public static void main(String[] args) throws InterruptedException,IOException {
        System.out.println("It works!");
        
        ParkingAccessControl pac = new ParkingAccessControl();

        
        Car c1 = new Car("CJ-01-AAA", System.currentTimeMillis());

        
        pac.carEntry(c1);

        
        TimeUnit.SECONDS.sleep(3);
        
        int price = pac.carExit("CJ-01-AAA");
        Car c2 = new Car("CJ-01-AAA", System.currentTimeMillis());
        pac.carEntry(c2);
        TimeUnit.SECONDS.sleep(7);
        pac.carExit("CJ-01-AAA");
        System.out.println("Price for parking is ="+price);

        pac.viewCurrentCars();
        pac.viewPastEntriesForCar("CJ-01-AAA");
        pac.viewPastUniqueEntries("CJ-01-AAA");

        Car[] cars=new Car[]{c1,c2};
        Writer writer = Files.newBufferedWriter(Paths.get("HistoryParkingFolder.json"));
        new Gson().toJson(cars,writer);
        writer.close();




        ////////////////////////////////
        
//        ParkingAccessFileControl fpac = new ParkingAccessFileControl();
//        Car c3 = new Car("CJ-02-AAA", System.currentTimeMillis());
//        Car c4 = new Car("CJ-02-BBB", System.currentTimeMillis());
//        Car c5 = new Car("CJ-02-CCC", System.currentTimeMillis());
//        fpac.carEntry(c3);
//        fpac.carEntry(c4);
//        fpac.carEntry(c5);
//
//        price = fpac.carExit("CJ-02-CCC");

        Car c3 = new Car("CJ-02-AAA", System.currentTimeMillis());
       Car c4 = new Car("CJ-02-BBB", System.currentTimeMillis());
      Car c5 = new Car("CJ-02-CCC", System.currentTimeMillis());
        pac.carEntry(c3);
        TimeUnit.SECONDS.sleep(2);
          pac.carEntry(c4);
        TimeUnit.SECONDS.sleep(3);
            pac.carEntry(c5);
        TimeUnit.SECONDS.sleep(4);
        Car[] cars1=new Car[]{c3,c4,c5};
        Writer writer1 = Files.newBufferedWriter(Paths.get("CurrentParkingFolder.json"));
        new Gson().toJson(cars1,writer1);
        writer1.close();
        
        System.out.println("Price to be payed = "+price);
        pac.viewPastUniqueEntries("CJ-01-AAA");
    }
}
