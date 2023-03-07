package isp.lab2;

import java.util.Scanner;

/**
 * Check readme.md file for the exercise requirements.
 *
 * @author Radu Miron
 */
public class Exercise2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dati un text care are cuvinetele separate prin virgula");
        String s=sc.nextLine();
        System.out.println("Dati o litera:");
        char litera = sc.next().charAt(0);
        String[] cuv=s.split(",");
        System.out.println("Cuvintele care incep cu litera "+litera+" sunt urmatoarele: ");
        for(int i=0;i<cuv.length;i++)
        {
            if(cuv[i].charAt(0)==litera)
                System.out.print(cuv[i]+" ");
        }
    }
}
