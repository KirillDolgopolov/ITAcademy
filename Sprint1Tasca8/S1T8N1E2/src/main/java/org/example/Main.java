package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> firstArray = new ArrayList<>();
        firstArray.add("Cuando te miro en la falda de Montjuïc sentada");
        firstArray.add("me parece verte en los brazos del gigantesco Alcides");
        firstArray.add("***---Es una linea sin letra 0---***");
        firstArray.add("ooooo");
        firstArray.add("que por proteger a la hija de su costado nacida");
        firstArray.add("transformándose en sierra se hubiese quedado aquí");


        ReturnWithLetterO lambda = array -> {
            ArrayList<String> array2 = new ArrayList<>();

            for (String s : array) {
                if (s.contains("o") && s.length() > 5) {
                    array2.add(s);
                }
            }

            return array2;
        };

        ArrayList<String> arrayList = lambda.returnLine(firstArray);

        for (String s : arrayList) {
            System.out.println(s);
        }


    }
}