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
public void getdata(PersonEnti personEnti,String username) throws Exception{
        preparedStatement=connection.prepareStatement("select * from persn where username=?");
        preparedStatement.setString(1,username);
        String name,password,email,fathername,gender;
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
        name=resultSet.getString("name");
        personEnti.setName(name);
        password=resultSet.getString("password");
        personEnti.setPassword(password);
        email=resultSet.getString("email");
        personEnti.setEmail(email);
        fathername=resultSet.getString("fathername");
        personEnti.setFathername(fathername);
        gender=resultSet.getString("gender");
        personEnti.setGender(gender);
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