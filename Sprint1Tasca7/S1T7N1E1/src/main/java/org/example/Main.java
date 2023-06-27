package org.example;

public class Main {
    public static void main(String[] args) {

        TrabajadorOnline t1onLine = new TrabajadorOnline("Bob", "Dowl", 20);
        TrabajadorPresencial t1Presencial = new TrabajadorPresencial("Karl", "Marks", 20);

        TrabajadorOnline.setTarifaInternet(50);
        TrabajadorPresencial.setBenzina(200);


        System.out.println(t1onLine.calcularSalario(160));
        System.out.println(t1Presencial.calcularSalario(160));

        System.out.println(t1onLine.calcularSalario(170));
        System.out.println(t1Presencial.calcularSalario(170));


    }
}