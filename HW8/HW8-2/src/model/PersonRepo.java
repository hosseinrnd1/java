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
        preparedStatement=connection.prepareStatement ("INSERT INTO persn(name,username,password, email,fathername,gender) VALUES (?,?,?,?,?,?)");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString (2,personEnti.getUsername());
        preparedStatement.setString (3,personEnti.getPassword());
        preparedStatement.setString (4,personEnti.getEmail());
        preparedStatement.setString (5,personEnti.getFathername());
        preparedStatement.setString (6,personEnti.getGender());

        preparedStatement.executeUpdate ();
    }
    public  void update (PersonEnti personEnti,String password) throws Exception{
        preparedStatement=connection.prepareStatement("UPDATE persn SET name=?,username=?,email=?,fathername=?,gender=? WHERE password=?");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString(2,personEnti.getUsername());
        preparedStatement.setString (3,personEnti.getEmail());
        preparedStatement.setString (4,personEnti.getFathername());
        preparedStatement.setString (5,personEnti.getGender());
        preparedStatement.setString (6,password);
        preparedStatement.executeUpdate ();
    }


    public  boolean selectuserandpass(String username ,String password) throws Exception {
        preparedStatement = connection.prepareStatement("SELECT * FROM persn where username=? and password=?");
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return true;

        } else {
            return false;}
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