package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listForSort = new ArrayList<>();
        listForSort.add("dfgd");
        listForSort.add("dlfkjgh dflgu dgodp ***********");
        listForSort.add("4567486");
        listForSort.add("dfgd4567");
        listForSort.add("00000000000000000000000000000000000000000000000000000000000000000");
        listForSort.add("");
        listForSort.add("01");
        listForSort.add(" ");
        listForSort.add("dfgddsio thjòis thj+`srtjh");


        listForSort.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(x -> System.out.println(x));


    }
}