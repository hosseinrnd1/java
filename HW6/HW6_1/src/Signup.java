
import java.sql.*;
import java.util.Scanner;

public class Signup {


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hossein",
                "hossein7581")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement=connection.prepareStatement("create table person1(usercode varchar2(20),username varchar2(20),password varchar2(20),email varchar2(20),age number ,education varchar2(20) )");

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into person1 (usercode,username,password,email,age,education) values (?,?,?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter usercode");
            String usercode = scanner.next();
            System.out.println("enter username");
            String username = scanner.next();
            System.out.println("enter password");
            String password = scanner.next();
            System.out.println("enter email");
            String email = scanner.next();
            System.out.println("enter age");
            int age=scanner.nextInt();
            System.out.println("enter your level of education ");
            String education=scanner.next();
            preparedStatement1.setString(1, usercode);
            preparedStatement1.setString(2, username);
            preparedStatement1.setString(3, password);
            preparedStatement1.setString(4, email);
            preparedStatement1.setInt(5, age);
            preparedStatement1.setString(6, education);
            preparedStatement1.executeUpdate();
            System.out.println("do you want update your password y or n");
            String answer=scanner.next();
            if(answer.equals("y")){
                System.out.println("enter your new password");
                String pass=scanner.next();
                PreparedStatement preparedStatement2 = connection.prepareStatement("update person1 set password=? WHERE username=?");
                preparedStatement2.setString(1,pass);
                preparedStatement2.setString(2,username);
                preparedStatement2.executeUpdate();
            }
           else {
                System.out.println("thanks");
            }



        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

}

