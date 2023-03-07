package isp.lab2;

import java.util.Random;

public class Exercise5 {

    public static int generare(Random n )
    {
        int a =-1000;
        int b= 1000;
        int result = n.nextInt(b-a) +a;
        return result;

    }
    public static void bubbleSort(int[] v){
        int i,j,aux;
        for(i=0;i<v.length-1;i++)
            for(j=i+1;j<v.length;j++)
            {
                if(v[i]>v[j]){aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;}
            }
    }
    public static void main(String[]args)
    { Random n=new Random();
        int[] v=new int[20];
        System.out.println("Vectorul generat este:");
        for(int i=0;i<v.length;i++)
        { v[i]=generare(n);
            System.out.print(v[i]+" ");}
        System.out.println();
        bubbleSort(v);
        System.out.println("Vectorul sortat este:");
        for(int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");

    }
}
