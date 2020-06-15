package myRemote;

import java.rmi.server.UnicastRemoteObject;

public class PersonServImplementor  extends UnicastRemoteObject implements PersonServ {

    public PersonServImplementor()throws Exception{}
    @Override
    public int save(Person person) throws Exception {

        PersonRepo personDA = new PersonRepo ();
        if ( personDA.insert(person)==true){
            personDA.close();
            return 1;
        }
        else return 0;



    }


}
