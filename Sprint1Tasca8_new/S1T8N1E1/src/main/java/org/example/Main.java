package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> firstArray = new ArrayList<>();
        firstArray.add("Cuando te miro en la falda de Montjuïc sentada");
        firstArray.add("me parece verte en los brazos del gigantesco Alcides");
        firstArray.add("***---Es una linea sin letra 0---***");
        firstArray.add("que por proteger a la hija de su costado nacida");
        firstArray.add("transformándose en sierra se hubiese quedado aquí");


        Stream<String> mySTream = firstArray.stream();
        mySTream = mySTream.filter(x -> x.contains("o"));
        List<String> listWithoutO = mySTream.collect(Collectors.toList());
        System.out.println(listWithoutO);


    }
}