package myRemote;

import java.rmi.Remote;

public interface PersonServ extends Remote {
    void save (Person person)throws Exception;
    void edit (Person person,String password)throws Exception;
}
