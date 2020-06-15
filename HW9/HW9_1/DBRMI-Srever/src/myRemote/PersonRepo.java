package myRemote;

import myRemote.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PersonRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public PersonRepo()throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hossein","hossein7581");
    }
    public void insert(Person person)throws Exception
    {
        preparedStatement = connection.prepareStatement("insert into persn2 (username,password) values (?,?)");
        preparedStatement.setString(1,person.getUsername());
        preparedStatement.setString(2,person.getPassword());
        preparedStatement.executeUpdate();
    }
    public void update(Person person,String password)throws Exception
    {
        preparedStatement = connection.prepareStatement("update persn2 set username=? , password=? where password=?");
        preparedStatement.setString(1,person.getUsername());
        preparedStatement.setString(2,person.getPassword());
        preparedStatement.setString(3,password);

        preparedStatement.executeUpdate();
    }


    public void close()throws Exception
    {
        preparedStatement.close();
        connection.close();
    }
}
