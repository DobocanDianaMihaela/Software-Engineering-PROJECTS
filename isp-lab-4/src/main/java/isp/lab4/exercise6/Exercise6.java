package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[]args){

        ComissionEmployee t1=new ComissionEmployee("Delia","Santa",2.5,5.5);
        HourlyEmployee t2=new HourlyEmployee("Andreea","Todea",2500.50,3);
        SalariedEmployee t3=new SalariedEmployee("Diana","Dobocan",500.5);
        System.out.println(t1.getPaymentAmount());
        System.out.println(t2.getPaymentAmount());
        System.out.println(t3.getPaymentAmount());
        double s=0;

        Employee [] p=new Employee[6];
        p[0]=new ComissionEmployee("Andreea","Todea",2.5,5.6);
        p[1]=new ComissionEmployee("Alexandra","Igna",5,5.5);
        p[2]=new HourlyEmployee("Tersinio","Malinas",205,5);
        p[3]=new HourlyEmployee("Delia","Santa",25,3);
        p[4]=new SalariedEmployee("Stefan","Pasca",210);
        p[5]=new SalariedEmployee("Cristi","Boca",5);

        for(int i =0;i<6;i++)
        {
            s=s+p[i].getPaymentAmount();


        }

        System.out.println("Total payment is: "+s);
    }

}
