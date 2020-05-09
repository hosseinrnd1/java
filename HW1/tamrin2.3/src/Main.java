import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Dastgah x=new Dastgah();
        Dastgah y=new Dastgah();
        Scanner input=new Scanner(System.in);
        System.out.println("ax+by=e");
        System.out.println("cx+dy=f");
        System.out.println("enter a , b, , c , d ,e,f ");

        x.a=input.nextFloat();
     x.b=input.nextFloat();
     x.c=input.nextFloat();
     x.d=input.nextFloat();
     x.e=input.nextFloat();
     x.f=input.nextFloat();


         y.e = x.e;
         y.d = x.d;
         y.b = x.b;
         y.f = x.f;
         y.a = x.a;
         y.c = x.c;

        if((x.a)/(x.c)==(y.b)/(y.d)){
            System.out.println("cant solve");
        }
       else{
           System.out.println("x=");
           System.out.println(x.result1());
           System.out.println("y=");
           System.out.println(y.result2());
        }
    }
    }

