package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> enterList = Arrays.asList(4, 8, 15, 16, 23, 42);

        System.out.println(devuelvoLaCadena(enterList));


    }


    static String devuelvoLaCadena(List<Integer> list) {
        StringBuilder cadenaFinal = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                cadenaFinal.append("e").append(list.get(i)).append(",");
            } else {
                cadenaFinal.append("o").append(list.get(i)).append(",");
            }
        }
        cadenaFinal.deleteCharAt(cadenaFinal.length() - 1); // para borrar la última coma
        return cadenaFinal.toString();
    }


}