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
                Person person = new Person().setUsername("z").setPassword("4");
                personServ.save(person);
                Person person1=new Person().setUsername("t").setPassword("6666");
                personServ.edit(person1,"4");


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
