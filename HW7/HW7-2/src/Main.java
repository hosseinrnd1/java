import model.PersonEnti;
import model.PersonServ;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Main
{
    public static void main (String[] args) {
        PersonEnti personEnti = new PersonEnti();
        //insert
        try {
            PersonServ.getInstance().save(personEnti.setUsername("eee").setPassword("2345aae"));
            System.out.println("saved successfully");
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
        System.out.println("sign in:");

        try {
            if ((PersonServ.getInstance().check("eee", "2345aae")) == 1) {
                System.out.println("you login");
                System.out.println("pride131 number1");
                System.out.println("saina number2");
                System.out.println("tiba  number3");
                System.out.println("tiba2  number4");
                System.out.println("enter number of your selected:");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();

                switch (number) {
                    case 1:
                        PersonServ.getInstance().edit(personEnti.setCar("pride131"));
                        break;
                    case 2:
                        PersonServ.getInstance().edit(personEnti.setCar("saina"));
                        break;
                    case 3:
                        PersonServ.getInstance().edit(personEnti.setCar("tiba"));
                        break;
                    case 4:
                        PersonServ.getInstance().edit(personEnti.setCar("tiba2"));
                        break;
                }System.out.println("thanks for your buy");}
            else
                System.out.println("you are not login");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
}

