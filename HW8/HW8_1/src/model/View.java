package model;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setBounds(100,100,400,400);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout gridLayout=new GridLayout();
        jFrame.setLayout(gridLayout);


        JPanel jPanel=new JPanel();
        JLabel jLabel=new JLabel("name:");
        JTextField jTextField=new JTextField(10);
        JLabel jLabel1=new JLabel("username:");
        JTextField jTextField1=new JTextField(10);
        JLabel jLabel2=new JLabel("password:");
        JTextField jTextField2 =new JTextField(10);
        JLabel jLabel3=new JLabel("email:");
        JTextField jTextField3=new JTextField(10);
        JLabel jLabel4=new JLabel("fathername:");
        JTextField jTextField4=new JTextField(10);
        JLabel jLabel5=new JLabel("gender:");

        JRadioButton jRadioButton=new JRadioButton("male");
        JRadioButton jRadioButton1=new JRadioButton("female");
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(jRadioButton);buttonGroup.add(jRadioButton1);

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





        JButton jButton=new JButton("signup");

        jPanel.add(jButton);

        jFrame.add(jPanel);



        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                String name=jTextField.getText();
                String username=jTextField1.getText();
                String password=jTextField2.getText();
                String email=jTextField3.getText();
                String fathername=jTextField4.getText();
                String gender="";
                if(jRadioButton.isSelected()) {
                     gender=jRadioButton.getText();
                }
                else if(jRadioButton1.isSelected()){
                     gender=jRadioButton1.getText();}




                try {
                    PersonServ.getInstance ().save (new PersonEnti ().setName (name).setUsername (username).setPassword(password).setEmail(email).setFathername(fathername).setGender(gender));
                    System.out.println ("saved successfully");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }




            }
        });

        JPanel jPanel1=new JPanel();
        jPanel1.setBounds(200,200,200,200);
        JLabel lbl=new JLabel("username:");
        JTextField jTx=new JTextField(10);
        JLabel lbl1=new JLabel("password:");
        JTextField jTx1=new JTextField(10);

        jPanel1.add(lbl);
        jPanel1.add(jTx);
        jPanel1.add(lbl1);
        jPanel1.add(jTx1);

        JButton jButton1=new JButton("sign in");
        jPanel1.add(jButton1);
        jFrame.add(jPanel1);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=jTx.getText();
                String password=jTx1.getText();
                try{
                    PersonServ.getInstance().check(username,password);
                }
                catch (Exception eee){
                    System.out.println(eee.getMessage());
                }

            }
        });



        jFrame.setVisible(true);






    }


}
