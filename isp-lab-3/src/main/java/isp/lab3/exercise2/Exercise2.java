package isp.lab3.exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(5, 4, "rosu");
        System.out.println("Lungimea este " + obj.getLength());
        System.out.println("Latimea este " + obj.getWidth());
        System.out.println("Culoarea este " + obj.getColor());
        System.out.println("Perimetrul  este " + obj.getPerimeter());
        System.out.println("Aria este " + obj.getArea());


    }
}
