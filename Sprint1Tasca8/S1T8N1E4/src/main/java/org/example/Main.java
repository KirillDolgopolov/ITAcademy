package org.example;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> meses = Arrays.asList(
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );



        PrinterOfMonths print = Main::imprimirMeses;
        print.printMonths(meses);

    }



    public static void imprimirMeses(List<String> list) {
        for (String s: list){
            System.out.println(s);
        }
    }

}
