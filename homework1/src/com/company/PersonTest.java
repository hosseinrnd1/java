package com.company;

import com.company.Person;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        String[] name = new String[3];
        String[] username = new String[3];
        String[] password = new String[3];
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 6) {
            try {
                System.out.printf("enter name and username and password %d", i + 1);
                name[i] = input.next();
                username[i] = input.next();
                password[i] = input.next();
                person[i] = new Person(name[i], username[i], password[i]);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}