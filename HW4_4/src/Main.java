
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter name");
        String name=input.next();
        System.out.println("enter family");
        String family=input.next();
        System.out.println("enter username");
        String username=input.next();
        List list=new ArrayList();
        list.add(name);
        list.add(family);
        list.add(username);
        Person person=new Person();
        Person p2=null;
        Person p3=null;
        Person p4=null;
        try{
            p2=(Person)person.clone();
            p3=(Person)person.clone();
            p4=(Person)person.clone();

        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");

        }
        System.out.println("your information is:");
        person.printDate(list);



    }


}
