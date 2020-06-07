import model.View;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

    View view=new View();

        view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        view.setBounds(200,200,800,300);
        view.setVisible(true);
        Thread thread1=new Thread(){
            @Override
            public void run() {
                view.view1();
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                view.view2();
            }
        };
        thread1.start();
        thread2.start();

}}
