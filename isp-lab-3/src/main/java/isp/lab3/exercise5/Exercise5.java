package isp.lab3.exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Mar", "Apa plata", "Fulgi Ovaz"};
        System.out.println("Dati valoarea creditului curent: ");
        int x = sc.nextInt();
        VendingMachine p1 = new VendingMachine(x, products);
        p1.userMenu();


    }
}
