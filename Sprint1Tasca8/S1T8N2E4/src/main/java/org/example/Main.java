package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {


        List<String> myList = Arrays.asList("africa", "hollandaise", "555555", "e-mail", "Coca-Cola", "coma", "baila", "Borsao", "445247", "ebay", "elefante");

        List<String> myList2 = new ArrayList<>(myList);


        System.out.println("Sort Alfabetic");
        List<String> result = sortAlfabetic(myList);

        for (String s : result) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Sort with E");


        sortWithE.apply(myList);

        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Replace a to 4");


        replaceAto4.apply(myList);

        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("OnlyNumbers");

        onliDigits(myList2);


    }

    static List<String> sortAlfabetic(List<String> list) {

        boolean ready = false;
        String varString = "";

        while (!ready) {
            ready = true;

            for (int i = 0; i < list.size() - 1; i++) {


                if (list.get(i).charAt(0) > list.get(i + 1).charAt(0)) {
                    varString = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, varString);
                    ready = false;
                }
            }
        }
        return list;
    }


    static Function<List<String>, List<String>> sortWithE = (List<String> list) -> {

        boolean ready = false;
        String varString = "";

        while (!ready) {
            ready = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).charAt(0) != 'e' && list.get(i + 1).charAt(0) == 'e') {
                    varString = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, varString);
                    ready = false;
                }
            }
        }
        return list;
    };


    static Function<List<String>, List<String>> replaceAto4 = (List<String> list) -> {

        boolean ready = false;
        String varString = "";

        while (!ready) {
            ready = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).contains("a")) {
                    varString = list.get(i).replace('a', '4');
                    list.set(i, varString);
                }
            }
        }
        return list;
    };


    static void onliDigits(List<String> list) {

        boolean ready = false;


        while (!ready) {
            ready = true;
            for (String s : list) {
                try {
                    System.out.println(Integer.parseInt(s));

                } catch (NumberFormatException e) {

                }


            }
        }
    }
}
