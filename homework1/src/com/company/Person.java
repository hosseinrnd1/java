package com.company;

public class Person {
private String name;
private String usrename;
private String password;
public  Person(String name,String usrename,String password){
    this.name=name;

if(usrename.length()>8||usrename.length()<8) //agar username bishtar az 8 character bashe =error
    throw new IllegalArgumentException("usernames number must be 8 number ");
    this.usrename=usrename;
if(password.length()>8||password.length()<8)
    throw new IllegalArgumentException("password number must be 8 number ");
   this.password=password;
}

}
