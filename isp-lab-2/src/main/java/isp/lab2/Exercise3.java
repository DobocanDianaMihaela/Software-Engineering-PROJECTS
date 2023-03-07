package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    public static int testarePrim (int n)
    {
        if (n < 2)
            return 0;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
    public static int suma(int n)
    {
        int s=0;
        while(n!=0) {s=s+n%10;
            n=n/10;}

        return s;


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,p,d,k=0,n,j=0,c=0;
        float mg;
        int[] v=new int[30];
        p=1;
        System.out.println("Dati primul numar din interval:");
        a=sc.nextInt();
        System.out.println("Dati ultimul numar din interval:");
        b=sc.nextInt();
        System.out.println("Pentru cate numere doriti sa facem suma cifrelor numarului:");
        n=sc.nextInt();
        for(int i=a;i<=b;i++)
        {  if(testarePrim(i)==1){p=p*i;
            k++;
            if(k<=n) { v[j] = i;
                j++;
            }
        }



        }
        for(j=0;j<n;j++)
        {
            if(suma(v[j])%2==0)c++;
        }
        mg=(float)Math.pow(p,1.0/k);
        System.out.println("Media geometrica a numerelor din intervalul ["+a+" " +b+"] este: "+mg);
        System.out.println("Numarul primelor "+ n+" numere prime care au suma cifrelor para este: "+c);

    }
}
