package model;
import model.PersonEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hossein", "hossein7581");
        connection.setAutoCommit (false);
    }

    public void insert(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO account1(username,password,car) VALUES (?,?,?)");
        preparedStatement.setString (1,personEnti.getUsername());
        preparedStatement.setString (2,personEnti.getPassword());

        preparedStatement.setString(3,personEnti.getCar());
        preparedStatement.executeUpdate ();
    }
    public void update (PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE account1 SET car =? WHERE password=? ");
        preparedStatement.setString (1,personEnti.getCar ());
        preparedStatement.setString (2,personEnti.getPassword ());

        preparedStatement.executeUpdate ();
    }


    public  boolean selectuserandpass(String username ,String password) throws Exception {
        preparedStatement = connection.prepareStatement("SELECT * FROM account1 where username=? and password=?");
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {

            return true;

        } else {

            return false;
        }
    }



    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}