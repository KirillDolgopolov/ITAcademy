package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> al = new ArrayList<>();
        al.add("Abrakadabra");
        al.add("Alloli");
        al.add("API");
        al.add("api");
        al.add("ABC");

        al.stream().filter(x -> x.length() == 3)
                .filter(x -> x.startsWith("A"))
                .forEach(x -> System.out.println(x));
    }

}