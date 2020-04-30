import java.util.List;

public class Person implements Cloneable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
 public void printDate(List list ){
     for (Object o:list ) {
         System.out.println(o);
     }
 }
}
