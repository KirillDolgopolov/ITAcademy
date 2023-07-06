package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<String> meses = Arrays.asList(
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );

        Stream<String> stream = meses.stream();
        stream.forEach(Main::imprimirMeses);
    }

    public static void imprimirMeses(String x) {
        System.out.println(x);
    }

}
