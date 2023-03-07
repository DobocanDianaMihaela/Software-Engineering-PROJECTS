package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FireAlarm t1= new FireAlarm(true);
        System.out.println(t1.toString());
        t1.setActive(true);
        System.out .println(t1.isActive());


    }
}
