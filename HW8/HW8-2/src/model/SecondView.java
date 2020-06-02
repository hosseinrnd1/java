package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondView extends JFrame {
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

    public SecondView(String password){
        gridLayout=new GridLayout();
        this.setLayout(gridLayout);
        this.setBounds(200,200,800,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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





        jButton=new JButton("update");

        jPanel.add(jButton);

        this.add(jPanel);



        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                String name=jTextField.getText();
                String username=jTextField1.getText();
                String password2=jTextField2.getText();
                String email=jTextField3.getText();
                String fathername=jTextField4.getText();
                String gender="";
                if(jRadioButton.isSelected()) {
                    gender=jRadioButton.getText();
                }
                else if(jRadioButton1.isSelected()){
                    gender=jRadioButton1.getText();}


                try {
                    PersonServ.getInstance().edit(new PersonEnti().setName(name).setUsername(username).setPassword(password2).setEmail(email).setFathername(fathername).setGender(gender),password);
                    System.out.println ("updated");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }


    }
});
        this.setVisible(true);
    }}