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

        //insert
        try {
            PersonServ.getInstance ().save (new PersonEnti ().setName ("hossein").setUsername ("h.a").setPassword("123").setEmail("a@gmail.com"));
            System.out.println ("saved successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }
        System.out.println("sign in");

        try{
            PersonServ.getInstance().check("h.a","123");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
