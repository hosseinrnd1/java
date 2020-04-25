package com.company;

import java.util.Scanner;
import java.lang.Exception;
public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[6];
        String[] name = new String[6];
        String[] family = new String[6];
        int[] age = new int[6];
        Scanner input = new Scanner(System.in);
        int i=0;
        while(i<6) {
            try {
                System.out.printf("enter personsname and family and age %d", i + 1);
                name[i] = input.next();
                family[i] = input.next();
                age[i] = input.nextInt();
                person[i] = new Person(name[i], family[i], age[i]);
                int flag, j;
                if (i > 0) {
                    for (int t=0 ; t < i; t++) {
                        for (j = t + 1; j <= i; j++) {
                            if ((name[t].compareTo(name[j]))==0&&(family[t].compareTo(family[j]))==0&&age[t]==age[j])
                            throw new Exception("information of person is in the arrray");
                        }


                    }
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
         i++;
        }
    }
}