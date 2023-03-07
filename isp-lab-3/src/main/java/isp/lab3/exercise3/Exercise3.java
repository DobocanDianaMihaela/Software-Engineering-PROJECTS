package isp.lab3.exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        Vehicle vehicul1 = new Vehicle("Mercedes", "AMG SL Roadster", 600, 'D');
        Vehicle vehicul2 = new Vehicle("Mercedes", "EQS", 500, 'D');

        vehicul1.setModel("AMG SL Roadster");
        System.out.println(vehicul1.getModel());

        vehicul2.setType("EQS");
        System.out.println(vehicul2.getType());

        vehicul2.setSpeed(700);
        System.out.println(vehicul2.getSpeed());

        vehicul1.setFuelType('B');
        System.out.println(vehicul2.getFuelType());

        System.out.println(vehicul2.equals(vehicul1, vehicul2));
        System.out.println("Numarul vehiculelor este: " + Vehicle.getNumberOfVehicles());


    }
}
