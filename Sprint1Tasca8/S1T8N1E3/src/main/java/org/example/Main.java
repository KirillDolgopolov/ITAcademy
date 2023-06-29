package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        PrinterOfMonths printer = array -> {
            for (String s : array) {
                System.out.println(s);
            }
        };

        List<String> meses = Arrays.asList(
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );

        printer.printMonths(meses);

    }
}