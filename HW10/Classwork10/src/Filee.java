import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filee extends java.io.File implements Runnable {
String pathname;
    public void run() {
        filereader();
        try {
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        filewriter();

    }


    public Filee(String pathname) {
        super(pathname);
      this.pathname=pathname;

    }
public   String filereader() {
    String r = "";

    try {

        FileReader fileReader = new FileReader(pathname);
        int asci = fileReader.read();

        while (asci != -1) {
            r += (char) asci;
            asci = fileReader.read();
        }

        fileReader.close();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    return r;
}

public  void filewriter(){
        FileWriter fileWriter;
    try {
      fileWriter =new FileWriter("e:\\exercise\\hello2");
        fileWriter.write(filereader());
        fileWriter.close();
    }
    catch (IOException e){
        System.out.println(e.getMessage());
    }
    }

}
