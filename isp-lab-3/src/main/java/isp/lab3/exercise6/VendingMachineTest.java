package isp.lab3.exercise6;


import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dati valoarea creditului curent: ");
        int x = sc.nextInt();
        System.out.println("Dati valoarea pe care doriti sa o introduceti: ");
        int y = sc.nextInt();

        VendingMachine p1 = VendingMachine.getInstance();

        p1.displayProducts();

        System.out.println("Alegeti un Id corespunzator unui produs ");

        int id = sc.nextInt();
        System.out.println("Produsul ales este: " + p1.selectProduct(id));

        p1.insertCoin(y);

        System.out.println("Credit curent: ");
        p1.displayCredit();


    }
}
