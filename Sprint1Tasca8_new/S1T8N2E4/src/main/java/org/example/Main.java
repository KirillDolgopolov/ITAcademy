package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<String> myList = Arrays.asList("africa", "hollandaise", "555555", "e-mail", "Coca-Cola",
                "coma", "baila", "Borsao", "445247", "ebay", "elefante");

        System.out.println("Alfabèticament pel primer caràcter");
        myList.sort(Comparator.comparing(x -> x.charAt(0)));
        myList.forEach(x -> System.out.println(x));

        System.out.println("Les cadenes que contenen una \"e\" primer, la resta de cadenes després");

        Collections.sort(myList, (Comparator.comparing(x -> !x.contains("e"))));
        myList.forEach(x -> System.out.println(x));

        System.out.println("Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.");
        myList.replaceAll(x -> x.replaceAll("a", "4"));
        myList.forEach(x -> System.out.println(x));

        System.out.println("Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).");

        myList.stream().filter(x -> {
            try {
                Integer.parseInt(x);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }).forEach(System.out::println);

    }
}
