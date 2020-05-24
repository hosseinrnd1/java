import model.PersonEnti;
import model.PersonServ;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;


public class Main
{
    public static void main (String[] args) {
        PersonEnti personEnti = new PersonEnti();
        //insert
        try {
            PersonServ.getInstance().save(personEnti.setUsername("p").setPassword("p"));
            System.out.println("saved successfully");
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
        System.out.println("sign in:");

        try {
            if ((PersonServ.getInstance().check("p", "p")) == 1) {
                System.out.println("you login");
                System.out.println("2gig 1000t number1");
                System.out.println("4gig 2000t number2");
                System.out.println("10gig 5000t number3");
                System.out.println("25gig 10000t number4");
                System.out.println("enter number of your selected:");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();

                switch (number) {
                    case 1:
                        PersonServ.getInstance().edit(personEnti.setHajm(2).setPrice(1000));
                        break;
                    case 2:
                        PersonServ.getInstance().edit(personEnti.setHajm(4).setPrice(2000));
                        break;
                    case 3:
                        PersonServ.getInstance().edit(personEnti.setHajm(10).setPrice(5000));
                        break;
                    case 4:
                        PersonServ.getInstance().edit(personEnti.setHajm(25).setPrice(10000));
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

