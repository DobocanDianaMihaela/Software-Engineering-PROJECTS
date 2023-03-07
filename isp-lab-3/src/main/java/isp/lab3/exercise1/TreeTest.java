package isp.lab3.exercise1;

public class TreeTest {
    public static void main(String[] args) {
        Tree x = new Tree();
        Tree y = new Tree();
        Tree z = new Tree();
        System.out.println(x.grow(10));
        System.out.println(y.grow(0));
        System.out.println(z.grow(-1));
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());


    }
}
