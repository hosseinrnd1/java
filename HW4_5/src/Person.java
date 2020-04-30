import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;



public class Person {
    private String name;
    private String fathername;
    private String username;


    public Person(String name, String fathername, String username){
        this.name=name;
        this.fathername=fathername;
        this.username=username;
        System.out.println(this);


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getFathername() {
        return fathername;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public String toString(){
        return String.format("name and fathername and username is: %s ,%s ,%s ",getName(),getFathername(),getUsername());

    }
    public static void printlist(List list){
        for(Object a:list)
            System.out.println(a);
    }


}
