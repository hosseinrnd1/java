
import java.sql.*;
import java.util.Scanner;

public class Signup {


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hossein",
                "hossein7581")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into person2 ( usercode,name,mellicode,fathername,job,salary,workhistory) values (?,?,?,?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter usercode");
            String usercode = scanner.next();
            System.out.println("enter name");
            String name = scanner.next();
            System.out.println("enter mellicode");
            String mellicode = scanner.next();
            System.out.println("enter fathername");
            String fathername = scanner.next();
            System.out.println("enter job");
            String job=scanner.next();
            System.out.println("enter salary");
            String salary=scanner.next();
            System.out.println("enter workhistory");
            String workhistory=scanner.next();
            preparedStatement1.setString(1, usercode);
            preparedStatement1.setString(2, name);
            preparedStatement1.setString(3, mellicode);
            preparedStatement1.setString(4, fathername);
            preparedStatement1.setString(5, job);
            preparedStatement1.setString(6, salary);
            preparedStatement1.setString(7,workhistory);
            preparedStatement1.executeUpdate();

            System.out.println("do you want to delete your information? y or n");
            String answer=scanner.next();

            if(answer.equals("y")){
            System.out.println("enter usercode");
            String usercode1=scanner.next();
            PreparedStatement preparedStatement2=connection.prepareStatement("delete from person2 where usercode=?");
            preparedStatement2.setString(1,usercode1);
            preparedStatement2.executeUpdate();
                System.out.println("your information was deleted");}
            else if(answer.equals("n")){
                System.out.println("thanks");

            }
            else {
                System.out.println("usercode not exist");
            }

        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

}

