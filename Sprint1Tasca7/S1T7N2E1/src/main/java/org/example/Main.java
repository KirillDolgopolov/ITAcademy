package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Bob Dylan");
        DefaultDirectory annot = p1.getClass().getAnnotation(DefaultDirectory.class);
        String path = annot.path();

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(p1);
            ous.close();
        } catch (IOException e) {
            e.getCause();
        }


    }


}