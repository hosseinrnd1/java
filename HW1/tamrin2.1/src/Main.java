import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Comput rectangle=new  Comput();
        Comput square=new Comput();

    Scanner input=new Scanner(System.in);
    System.out.println("enter length and width of rectangle");
            rectangle.length=input.nextInt();
        rectangle.width=input.nextInt();
        System.out.println("rectangle area");
        rectangle.area();
        System.out.println("rectangle mohit");
        rectangle.mohit();
        System.out.println("enter length and width of square");
            square.length=input.nextInt();
        square.width=input.nextInt();

        System.out.println("square area");
        square.area();
        System.out.println("square mohit");
        square.mohit();


    }
}
