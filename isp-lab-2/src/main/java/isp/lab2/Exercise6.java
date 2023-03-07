package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    public static void nerecursiv(int n)
    {  int[] v=new int[n];
        int a = 1, b = 2, i;
        v[0]=a;
        v[1]=b;
        if (n < 1)
            return;
        for (i = 2; i < n; i++)
        {
            v[i] = a * b;
            a = b;
            b= v[i];
        }

        for(int j=0;j<v.length;j++)
            System.out.print(v[j] + " ");
    }

    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cate elemente doriti sa aiba vectorul?: ");
        n=sc.nextInt();
        nerecursiv(n);




    }
}
