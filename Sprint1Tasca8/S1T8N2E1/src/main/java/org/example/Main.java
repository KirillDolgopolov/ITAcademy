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


        List<String> al2 = devolvator(al);

        for (String string: al2){
            System.out.println(string);
        }
    }






    static List<String> devolvator(List<String> list) {
        List<String> returnList = new ArrayList<>();

        for (String s : list) {
            if (s.charAt(0) == 'A' && s.length() == 3) {
                returnList.add(s);
            }
        }
        return returnList;
    }

}