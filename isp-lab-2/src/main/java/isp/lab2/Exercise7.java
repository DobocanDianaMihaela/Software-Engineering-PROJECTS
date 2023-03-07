package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void guess(int x){
        int k=0;
        int[] a=new int[100];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<100;i++){
            System.out.println("Care crezi ca este numarul generat?");
            int y = sc.nextInt();
            a[i]=y;
            if(y==x){
                System.out.println("RASPUNS CORECT");
                k++;
                break;
            }
            else{
                if(y<x){
                    System.out.println("RASPUNS GRESIT, NUMARUL ESTE PREA MIC");
                    k++;

                }
                if(y>x){
                    System.out.println("RASPUNS GRESIT, NUMARUL ESTE PREA MARE");
                    k++;
                }
            }
        }

        int aux=k;
        for(int i=0;i<k;i++){
            if (a[i]==a[i+1])
                aux--;
        }
        System.out.println("Ati avut "+aux+" incercari");

    }


    public static void main(String[] args) {
        Random n =new Random();
        int rezultat = n.nextInt(100);
        System.out.println("Numarul generat este:"+rezultat);
        guess(rezultat);
    }
}
