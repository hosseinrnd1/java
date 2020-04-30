import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter name");
        String name=input.next();
        System.out.println("enter username");
        String username=input.next();
        System.out.println("enter average");
        int average=input.nextInt();
        Map map=new HashMap();
        map.put(1,name);
        map.put(2,username);
        map.put(3,average);
        Set set=map.keySet();
        System.out.println("your name and username and average is:");
        for(Object a :set){
            System.out.println(map.get(a));
        }

    }
}
