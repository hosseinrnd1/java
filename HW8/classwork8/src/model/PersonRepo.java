package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonRepo implements AutoCloseable{
    //public class PersonRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hossein", "hossein7581");
        connection.setAutoCommit (false);
    }

    public void insert(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO person(name,username,password, email) VALUES (?,?,?,?)");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString (2,personEnti.getUsername());
        preparedStatement.setString (3,personEnti.getPassword());
        preparedStatement.setString (4,personEnti.getEmail());
        preparedStatement.executeUpdate ();
    }


    public  void selectuserandpass(String username ,String password) throws Exception {
        preparedStatement = connection.prepareStatement("SELECT * FROM person where username=? and password=?");
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("you login");

        } else {
            System.out.println("you are not login");
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