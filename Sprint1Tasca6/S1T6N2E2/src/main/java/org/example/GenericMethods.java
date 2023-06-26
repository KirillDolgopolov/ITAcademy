package org.example;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {


    public static <V> void imprimirArgumentos(V... arrayOfArguments) {
        List<V> myList = Arrays.asList(arrayOfArguments);

        for (V v : myList) {
            System.out.println(v);
        }

    }


}
