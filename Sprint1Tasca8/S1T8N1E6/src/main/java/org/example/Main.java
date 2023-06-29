package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listForSort = new ArrayList<>();
        listForSort.add("dfgd");
        listForSort.add("dlfkjgh dflgu dgodp ***********");
        listForSort.add("4567486");
        listForSort.add("dfgd4567");
        listForSort.add("");
        listForSort.add("01");
        listForSort.add(" ");
        listForSort.add("dfgddsio thjòis thj+`srtjh");


        String varString;
        boolean desordenado = true;

        while (desordenado) {
            desordenado = false;
            for (int i = 0; i < listForSort.size() - 1; i++) {

                if (listForSort.get(i).length() > listForSort.get(i + 1).length()) {
                    varString = listForSort.get(i + 1);
                    listForSort.set(i + 1, listForSort.get(i));
                    listForSort.set(i, varString);
                    desordenado = true;
                }
            }
        }

        for (String str : listForSort) {
            System.out.println(str);
        }
    }
}