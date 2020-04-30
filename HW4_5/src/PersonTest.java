import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter name");
        String  name=input.next();
        System.out.println("enter father name");
        String fatername=input.next();
        System.out.println("enter username");
        String username=input.next();
        Double[] grade=new Double[5];

        for(int i=0;i<5;i++){
            System.out.println("enter grade "+(i+1));
            grade[i]=input.nextDouble();
        }

        List<Double> list=new ArrayList<Double>(Arrays.asList(grade));

        Person person=new Person(name,fatername,username);
        System.out.println("\ngrades is :");
        Person.printlist(list);
    }
}
