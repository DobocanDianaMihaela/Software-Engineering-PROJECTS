package isp.lab3.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Tree obj = new Tree();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        obj.grow(m);
        System.out.println(obj.toString());


    }
}
