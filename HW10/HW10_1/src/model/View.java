package model;
import model.PersonEnti;
import model.PersonServ;
import model.PersonEnti;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame  {

    GridLayout gridLayout;
    JPanel jPanel;
    JLabel jLabel;
    JTextField jTextField;
    JLabel jLabel1;
    JTextField jTextField1;
    JLabel jLabel2;
    JTextField jTextField2;
    JLabel jLabel3;
    JTextField jTextField3;
    JLabel jLabel4;
    JTextField jTextField4;
    JLabel jLabel5;
    JRadioButton jRadioButton;
    JRadioButton jRadioButton1;
    ButtonGroup buttonGroup;
    JButton jButton;

    JPanel panel2;
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;
    JLabel lbl6;
    JLabel lbl11;
    JLabel lbl22;
    JLabel lbl33;
    JLabel lbl44;
    JLabel lbl55;
    JLabel lbl66;
    JButton btn1;
String username;
public View(){
    view1();
    view2();
}
    public void view1() {

            gridLayout = new GridLayout();
            this.setLayout(gridLayout);
            jPanel = new JPanel();
            jLabel = new JLabel("name:");
            jTextField = new JTextField(10);
            jLabel1 = new JLabel("username:");
            jTextField1 = new JTextField(10);
            jLabel2 = new JLabel("password:");
            jTextField2 = new JTextField(10);
            jLabel3 = new JLabel("email:");
            jTextField3 = new JTextField(10);
            jLabel4 = new JLabel("fathername:");
            jTextField4 = new JTextField(10);
            jLabel5 = new JLabel("gender:");

            jRadioButton = new JRadioButton("male");
            jRadioButton1 = new JRadioButton("female");
            buttonGroup = new ButtonGroup();
            buttonGroup.add(jRadioButton);
            buttonGroup.add(jRadioButton1);



            jPanel.add(jLabel);
            jPanel.add(jTextField);
            jPanel.add(jLabel1);
            jPanel.add(jTextField1);
            jPanel.add(jLabel2);
            jPanel.add(jTextField2);
            jPanel.add(jLabel3);
            jPanel.add(jTextField3);
            jPanel.add(jLabel4);
            jPanel.add(jTextField4);
            jPanel.add(jLabel5);
            jPanel.add(jRadioButton);
            jPanel.add(jRadioButton1);


            jButton = new JButton("signup");

            jPanel.add(jButton);

            this.add(jPanel);


            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ee) {
                    String name = jTextField.getText();
                    username = jTextField1.getText();
                    String password = jTextField2.getText();
                    String email = jTextField3.getText();
                    String fathername = jTextField4.getText();
                    String gender = "";
                    if (jRadioButton.isSelected()) {
                        gender = jRadioButton.getText();
                    } else if (jRadioButton1.isSelected()) {
                        gender = jRadioButton1.getText();
                    }


                    try {


                        PersonServ.getInstance().save(new PersonEnti().setName(name).setUsername(username).setPassword(password).setEmail(email).setFathername(fathername).setGender(gender));
                        System.out.println("saved successfully");

                    } catch (Exception e) {
                        System.out.println("Fail to save!" + e.getMessage());
                    }


                }
            });

        }


    public void view2(){
        panel2 = new JPanel();
        lbl1 = new JLabel("name:");
        lbl2 = new JLabel("username:");
        lbl3 = new JLabel("password:");
        lbl4 = new JLabel("email:");
        lbl5 = new JLabel("fathername:");
        lbl6 = new JLabel("gender:");
        lbl11 = new JLabel();
        lbl22 = new JLabel();
        lbl33 = new JLabel();
        lbl44 = new JLabel();
        lbl55 = new JLabel();
        lbl66 = new JLabel();
        btn1=new JButton("display");
        panel2.add(lbl1);
        panel2.add(lbl2);
        panel2.add(lbl3);
        panel2.add(lbl4);
        panel2.add(lbl5);
        panel2.add(lbl6);
        panel2.add(lbl11);
        panel2.add(lbl22);
        panel2.add(lbl33);
        panel2.add(lbl44);
        panel2.add(lbl55);
        panel2.add(lbl66);
        panel2.add(btn1);
        this.add(panel2);
btn1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            PersonEnti personEnti = new PersonEnti();
            PersonServ.getInstance().getdata1(personEnti, username);
            String name1 = personEnti.getName();
            String username1 = username;
            String password1 = personEnti.getPassword();
            String email1 = personEnti.getEmail();
            String fathername1 = personEnti.getFathername();
            String gender1 = personEnti.getGender();
            lbl11.setText(name1);
            lbl22.setText(username1);
            lbl33.setText(password1);
            lbl44.setText(email1);
            lbl55.setText(fathername1);
            lbl66.setText(gender1);


        }
        catch (Exception ee){
            System.out.println(ee.getMessage());
        }
    }
});

    }
}