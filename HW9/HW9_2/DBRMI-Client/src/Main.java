import myRemote.Person;
import myRemote.PersonServ;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Main {
    public static void main(String[] args) {

        try {

            PersonServ personServ = (PersonServ) Naming.lookup("//localhost/DBService");
            Person person = new Person().setFood("kabab").setPaid(500);
            if (personServ.save(person)==1){
                System.out.println("thanks for buy");
            }
            else {
                System.out.println("please pay");
            }




        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
