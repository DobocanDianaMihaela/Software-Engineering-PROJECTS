package isp.lab2;

import java.util.Scanner;

public class Exercise4 {


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
    public static void main(String[]args){

        int[] v={1,3,7,8,2};
        Scanner sc = new Scanner(System.in);
        int x=1,y=1,z=1;
        for(int i=0;i<v.length;i++)
        {  if(x==1 && testarePrim(v[i])==1) {x=0;
            System.out.println("Primul numar prim este: "+v[i]+" si se afla pe pozitia "+i);}
            if(y==1 && v[i]%2!=0){ y=0;
                System.out.println("Primul numar impar este: "+v[i]+" si se afla pe pozitia "+i); }

            if(z==1 && v[i]%2==0){ z=0;
                System.out.println("Primul numar par este: "+v[i]+" si se afla pe pozitia "+i); }




        }
    }
}
