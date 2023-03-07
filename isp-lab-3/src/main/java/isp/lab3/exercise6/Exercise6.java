package isp.lab3.exercise6;


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dati valoarea creditului curent: ");
        int x = sc.nextInt();
        VendingMachine p1 = VendingMachine.getInstance();
        p1.userMenu();


    }
}
