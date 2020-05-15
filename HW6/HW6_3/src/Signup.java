
import java.sql.*;
import java.util.Scanner;

public class Signup {


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hossein",
                "hossein7581")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into person3(usercode,name,entranceyear,average) values (?,?,?,?)");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter usercode");
            String usercode = scanner.next();
            System.out.println("enter name");
            String name = scanner.next();
            System.out.println("enter entrance year");
            int entranceyear = scanner.nextInt();
            System.out.println("enter average");
            double average = scanner.nextDouble();

            preparedStatement1.setString(1, usercode);
            preparedStatement1.setString(2, name);
            preparedStatement1.setLong(3, entranceyear);
            preparedStatement1.setDouble(4, average);
            preparedStatement1.executeUpdate();

            System.out.println("do you want update your average y or n");
            String answer1=scanner.next();
            if(answer1.equals("y")){
                System.out.println("enter your new average");
                double avg=scanner.nextDouble();
                PreparedStatement preparedStatement2 = connection.prepareStatement("update person3 set average=? WHERE usercode=?");
                preparedStatement2.setDouble(1,avg);
                preparedStatement2.setString(2,usercode);
                preparedStatement2.executeUpdate();
            }
            else {
                System.out.println("thanks");
            }
            System.out.println("do you want to delete your information? y or n");
            String answer=scanner.next();

            if(answer.equals("y")){
                System.out.println("enter usercode");
                String usercode1=scanner.next();
                PreparedStatement preparedStatement3=connection.prepareStatement("delete from person3 where usercode=?");
                preparedStatement3.setString(1,usercode1);
                preparedStatement3.executeUpdate();
                System.out.println("your information was deleted");}
            else if (answer.equals("n")){
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

