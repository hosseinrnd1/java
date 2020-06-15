package myRemote;

import java.rmi.server.UnicastRemoteObject;

public class PersonServImplementor  extends UnicastRemoteObject implements PersonServ {

        public PersonServImplementor()throws Exception{}
        @Override
        public void save(Person person) throws Exception {

            PersonRepo personDA = new PersonRepo ();
            personDA.insert(person);
            personDA.close();

}

    @Override
    public void edit(Person person,String password) throws Exception {
        PersonRepo personRepo=new PersonRepo();
        personRepo.update(person, password);
        personRepo.close();
    }
}
