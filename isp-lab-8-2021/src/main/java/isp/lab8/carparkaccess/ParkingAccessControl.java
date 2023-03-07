/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author mihai.hulea
 */
public class ParkingAccessControl {

    public static final int MAX_CAPACITY = 5;
    private double price;
    private long time;
    
    private ArrayList<Car>  parkedCars = new ArrayList<>();
   
    private ArrayList<Car>  previousCars = new ArrayList<>();
    private Integer capacity = 0;
    private boolean isFull() {
        return this.capacity >= 5;
    }

    public void carEntry(Car car){
        //1. sa verific capacitatea
        // 2. daca capacitatea este depasita -> return
          if(this.isFull())return;
          else  this.capacity++;


        //3. verific daca nu cumva masina este deja in parcare, si daca este -> return 
        for (Car i:parkedCars) {
            if(i.getPlateNumber().equals(car.getPlateNumber()))return;
        }

        //4. daca masina nu este in parcare salvez obiectul de tip car in parkedCars
       this.parkedCars.add(car);
        System.out.println("Car "+car+" is entering car park!");
    }

    public void setParkedCars(ArrayList<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public int carExit(String plateNumber){
        //1. cautam dupa plate number un Car in parkedCars
        //2. daca nu am gasit plateNumber -> return 
        //3. daca am gasit masina, 
            //calculez timpul de asteptare in parcare, -> System.currentTimeMiliseconds()
            //calculez pretul, 
            //sterg masina din parkedCars si o adaug in previousCars
            //returnez pretul

        for(Car i:parkedCars){
            if(i.getPlateNumber().equals(plateNumber)){

                time=System.currentTimeMillis()-i.getEntryTime();
                i.setTotalStay(time);
                price= (int)time*0.001;
                i.setTotalCost((int)price);
                parkedCars.remove(i);
                this.capacity--;
                this.previousCars.add(i);
                System.out.println("Car with plate number "+plateNumber+" is exiting");
                return (int)price;
            }
        }
        
       return 1;

    }
    
    public void viewCurrentCars(){
        System.out.println("Display all parked cars.");
        for(Car i:parkedCars){

            System.out.println(i.toString());
            double currentCost=(System.currentTimeMillis()-i.getEntryTime())*0.001;
            System.out.println("Current cost is: "+currentCost);

        }
        System.out.println("Free spaces: ");
        System.out.println(MAX_CAPACITY-this.capacity);
    }
    
    public void viewPastEntriesForCar(String plateNumber){
        System.out.println("Display all past entries for a car.");
        double k=0;
        for(Car i:previousCars)
        {if(i.getPlateNumber().equals(plateNumber)){
            System.out.println(i.toString());
         System.out.println("Total cost "+i.getTotalCost());
         System.out.println("Total stay "+i.getTotalStay());
         k=k+i.getTotalCost();
        }

    }
    System.out.println("Total cost for all stays "+k);
    }
    
    public void viewPastUniqueEntries(String plateNumber){
        System.out.println("Display all unique entries.");
        Predicate<Car> byPlateNumber = car -> car.getPlateNumber().equals(plateNumber);

        long result = previousCars.stream().filter(byPlateNumber).collect(Collectors.toList()).stream().count();
        if(result==1)System.out.println("Unique entry");
        else if(result>1)System.out.println("The car with plate number: "+plateNumber+" entered "+result+" times");


    }
    
}
