package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Vino wine1 = new Vino("Tinto", false, "Montsant", "Bell Cross", "El Tracte", 2021);
        Vino wine2 = new Vino("Orange", false, "Penedès", "Parés Baltà", "Amphora Brisat", 2022);

        try {
            FileOutputStream fos = new FileOutputStream("wines.ser");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(wine1);
            ous.writeObject(wine2);
            ous.close();
            System.out.println("Objetos han sido guardados");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("wines.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Vino wineFirstTable = (Vino) ois.readObject();
            Vino wineSecondTable = (Vino) ois.readObject();
            ois.close();

            System.out.println(wineFirstTable);
            System.out.println(wineSecondTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}