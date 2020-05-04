import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name:");
        String name=scanner.next();
        System.out.println("enter username:");
        String username=scanner.next();
        System.out.println("enter password:");
        String password=scanner.next();
        System.out.println("enter address:");
        String address=scanner.next();
        System.out.println("enter phonenumber:");
        String phonenumber=scanner.next();
        System.out.println("enter evidence:");
        String evidence=scanner.next();
        Person person=new Person().setname(name).setusername(username).setpassword(password).setaddress(address).setphonenumber(phonenumber).setevidence(evidence);
        Singleton.getInstance().printData(person);
    }


}
