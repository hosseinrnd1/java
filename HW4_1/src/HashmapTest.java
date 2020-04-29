import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashmapTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int id;
        String name;
        String family;
        System.out.println("enter name");
        name=input.next();
        System.out.println("enter family");
        family=input.next();
        System.out.println("enter id");
        id=input.nextInt();
        Map map=new HashMap();
        map.put(id,name+family);
        System.out.println("enter your key");
        int key=input.nextInt();
        if(key==id)
            System.out.println("value is "+map.get(key));
        else
            System.out.println("your key id unknow");

    }


}
