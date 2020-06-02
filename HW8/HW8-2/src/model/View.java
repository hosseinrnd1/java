package model;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
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


    JPanel jPanel1;
    JLabel lbl;
    JTextField jTx;
    JLabel lbl1;
    JTextField jTx1;
    JButton jButton1;


    public View(){
        gridLayout=new GridLayout();
        this.setLayout(gridLayout);
        jPanel=new JPanel();
        jLabel=new JLabel("name:");
        jTextField=new JTextField(10);
        jLabel1=new JLabel("username:");
        jTextField1=new JTextField(10);
        jLabel2=new JLabel("password:");
        jTextField2 =new JTextField(10);
        jLabel3=new JLabel("email:");
        jTextField3=new JTextField(10);
        jLabel4=new JLabel("fathername:");
        jTextField4=new JTextField(10);
        jLabel5=new JLabel("gender:");

        jRadioButton=new JRadioButton("male");
        jRadioButton1=new JRadioButton("female");
        buttonGroup=new ButtonGroup();
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





        jButton=new JButton("signup");

        jPanel.add(jButton);

        this.add(jPanel);



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

        jPanel1=new JPanel();
        jPanel1.setBounds(200,200,200,200);
        lbl=new JLabel("username:");
         jTx=new JTextField(10);
         lbl1=new JLabel("password:");
         jTx1=new JTextField(10);

        jPanel1.add(lbl);
        jPanel1.add(jTx);
        jPanel1.add(lbl1);
        jPanel1.add(jTx1);

        JButton jButton1=new JButton("sign in");
        jPanel1.add(jButton1);

        this.add(jPanel1);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=jTx.getText();
                String password=jTx1.getText();
                try{
                    if ((PersonServ.getInstance().check(username,password))==1){
                    SecondView secondView=new SecondView(password);

                    }}
                catch (Exception eee){
                    System.out.println(eee.getMessage());
                }
            }
        });








    }










}
