import  java.util.Scanner;
import static java.lang.Math.*;
public class Moadele {
    public static void main(String[] args) {
        System.out.println("moadele is ax^2+bx+c");
        double a, b, c;
        Scanner input = new Scanner(System.in);

       try {

           System.out.println("enter a:");
           a = input.nextDouble();
           System.out.println("enter b");
           b = input.nextDouble();
           System.out.println("enter c");
           c = input.nextDouble();
           double x1=findx1(a,b,c);
           double x2=findx2(a,b,c);
           System.out.println("x1="+x1+"\n"+"x2="+x2);

       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }



    }

    public static double delta(double a, double b, double c) throws Exception {
        double delta = pow(b, 2) - (4*a*c);
        if (delta < 0) {
            throw new Exception("delta is <0");
        } else
            return delta;
    }
    public static double findx1(double a,double b,double c) throws Exception{
        double x1=(-b+sqrt(delta(a,b,c)))/(2*a);
        return x1;
    }
    public static double findx2(double a,double b,double c) throws Exception{
        double x1=(-b-sqrt(delta(a,b,c)))/(2*a);
        return x1;
    }

}