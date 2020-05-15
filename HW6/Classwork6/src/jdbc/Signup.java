package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Signup {


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hossein",
                "hossein7581")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into person (name,username,password,email) values (?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter name");
            String name = scanner.next();
            System.out.println("enter username");
            String username = scanner.next();
            System.out.println("enter password");
            String password = scanner.next();
            System.out.println("enter email");
            String email = scanner.next();
            preparedStatement1.setString(1, name);
            preparedStatement1.setString(2, username);
            preparedStatement1.setString(3, password);
            preparedStatement1.setString(4, email);
            preparedStatement1.executeUpdate();

            System.out.println("enter username for sign in");
            String username1=scanner.next();
            System.out.println("enter password");
            String password1=scanner.next();

            PreparedStatement preparedStatement2=connection.prepareStatement("select * from person where username=? and password=?");
            preparedStatement2.setString(1,username1);
            preparedStatement2.setString(2,password1);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if(resultSet.next()){

                System.out.println("you are login");

            }
            else{
                System.out.println("you are not login");
            }





        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

}

