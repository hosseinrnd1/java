package myRemote;

import java.rmi.Remote;

public interface PersonServ extends Remote {
    int save (Person person)throws Exception;

}
