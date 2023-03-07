package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        String[] products = {"Mar", "Apa plata", "Fulgi Ovaz"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Dati valoarea creditului curent: ");
        int x = sc.nextInt();
        System.out.println("Dati valoarea pe care doriti sa o introduceti: ");
        int y = sc.nextInt();

        VendingMachine p1 = new VendingMachine(x, products);

        p1.displayProducts();

        System.out.println("Alegeti un Id corespunzator unui produs ");

        int id = sc.nextInt();
        System.out.println("Produsul ales este: " + p1.selectProduct(id));

        p1.insertCoin(y);

        System.out.println("Credit curent: ");
        p1.displayCredit();


    }


}
