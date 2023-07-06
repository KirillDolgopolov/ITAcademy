package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> enterList = Arrays.asList(4, 8, 15, 16, 23, 42);

        System.out.println(devuelvoLaCadena(enterList));
    }


    static String devuelvoLaCadena(List<Integer> list) {
        StringBuilder sb = new StringBuilder();

        list.stream().map(x -> {
            if (x % 2 == 0) {
                return ("o" + x);
            } else {
                return ("e" + x);
            }

        }).forEach(x -> sb.append(x + ","));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}

