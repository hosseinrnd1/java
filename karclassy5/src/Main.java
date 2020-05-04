import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cal;
        System.out.println("enter number1 and operator + or - and enter number2 (singledigit) :");
        cal=scanner.next();
        char[] charArray=cal.toCharArray();

        if(charArray[1]=='+'){
            Calculate calculate=Factory.getoperator(charArray[1]);
            System.out.println( calculate.calc(charArray[0]-48,charArray[2]-48));
        }
        if(charArray[1]=='-'){
            Calculate calculate=Factory.getoperator(charArray[1]);
            System.out.println( calculate.calc(charArray[0]-48,charArray[2]-48));
        }

    }
}
