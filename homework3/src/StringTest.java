import java.util.Scanner;
import java.lang.String;
public class StringTest {
    public static void main(String[] args) {
        System.out.println("enter string");
        String str;
        Scanner input = new Scanner(System.in);
        try {
            str = input.next();
            int i = 0;
            while (i <= str.length()) {
                if (str.charAt(i)=='1' )
                    throw new Exception("error");
                else if(str.charAt(i)=='2')
                    throw new Exception("error");
                     else if(str.charAt(i)=='3')
                    throw new Exception("error");
                          else if(str.charAt(i)=='4')
                    throw new Exception("error");
                               else if(str.charAt(i)=='5')
                    throw new Exception("error");
                                    else if(str.charAt(i)=='6')
                    throw new Exception("error");
                                         else if(str.charAt(i)=='7')
                    throw new Exception("error");
                                              else if(str.charAt(i)=='8')
                    throw new Exception("error");
                                                   else if(str.charAt(i)=='9')
                    throw new Exception("error");

                i++;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}