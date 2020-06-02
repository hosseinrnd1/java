import model.SecondView;
import model.View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        View view=new View();
        view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        view.setBounds(200,200,800,300);
        view.setVisible(true);


    }
}
