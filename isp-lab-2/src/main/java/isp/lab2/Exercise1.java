package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    public static int generare(Random n )
    {
        int a = 2;
        int b= 10;
        int result = n.nextInt(b-a) +a;
        return result;

    }

    public static void citireVector(int result){
        Scanner sc = new Scanner(System.in);
        int[] v=new int [result];
        int i,s;
        float MA;
        s=0;MA=0;
        System.out.println("Dati elementele din vector:");
        for(i=0;i<v.length;i++) {
            System.out.println("v["+i+"]=");
            v[i] = sc.nextInt();
            s=s+v[i];
        }
        MA=(float)s/result;
        System.out.println( "Media aritmetica a numerelor din vector este:"+MA);
    }

    public static void main(String[]args)
    {Random n=new Random();
        float MA=0;
        int k=generare(n);
        System.out.println( "Numarul random generat este:"+k);
        citireVector(k);

    }

}