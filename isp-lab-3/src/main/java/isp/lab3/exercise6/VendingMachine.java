package isp.lab3.exercise6;

import java.util.Scanner;

public class VendingMachine {
    private static VendingMachine Instance;
    int a, b;
    private int credit;
    private String[] products;

    private VendingMachine(int credit, String[] products) {
        this.credit = credit;
        this.products = products;


    }

    public static VendingMachine getInstance() {
        if (Instance == null) {

            String[] products = {"Mar", "Apa plata", "Fulgi Ovaz"};
            Instance = new VendingMachine(70, products);

        }
        return Instance;

    }


    public void displayProducts() {
        System.out.println("Produsele disponibile sunt: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " cu id: " + i);

        }
    }

    public void insertCoin(int value) {
        this.credit = this.credit + value;

    }

    public String selectProduct(int id) {
        for (int i = 0; i < products.length; i++)
            if (id == i) return products[i];


        return "ID-ul ales nu exista.Incercati din nou! :)";

    }

    public void displayCredit() {
        System.out.println(credit);


    }

    public void userMenu() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1 ... Lista produse disponibile");
            System.out.println("2...Doresc sa selectez un produs");
            System.out.println("3...Doresc sa adaug o suma");
            System.out.println("4...Doresc sa  verific creditul");
            System.out.println("5...EXIT");

            String optiuni = s.nextLine();

            switch (optiuni) {
                case "1":
                    this.displayProducts();
                    break;
                case "2":
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Introduceti id-ul produsului dorit: ");
                    a = sc.nextInt();

                    System.out.println("Produsul selectat este: " + this.selectProduct(a));
                    break;
                case "3":
                    System.out.println("Ce valoare doriti sa adaugati?: ");
                    Scanner scan = new Scanner(System.in);
                    b = scan.nextInt();
                    this.insertCoin(b);
                    break;
                case "4":
                    this.displayCredit();
                    break;
                case "5":
                    s.close();
                    break;

            }
        }
    }

}
