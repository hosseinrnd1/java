package myRemote;

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
    public boolean insert(Person person)throws Exception {
        if (person.getPaid() > 0) {
            preparedStatement = connection.prepareStatement("insert into person22(food,paid) values (?,?)");
            preparedStatement.setString(1, person.getFood());
            preparedStatement.setDouble(2, person.getPaid());
            preparedStatement.executeUpdate();
            return true;
        } else {return false;}

    }



    public void close()throws Exception
    {
        preparedStatement.close();
        connection.close();
    }
}
