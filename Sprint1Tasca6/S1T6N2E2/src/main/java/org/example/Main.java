package org.example;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", "Casado", 56);
        Persona p2 = new Persona("Kirill", "Dolgopolov", 34);
        Persona p3 = new Persona("Xian", "Li", 99);

        String s1 = "Pararam!";
        String s2 = "Hola Mundo";

        Double d1 = 34343436.345;
        Float f1 = 8747.454576F;

        GenericMethods.imprimirArgumentos(p1, d1, f1, s1, p2, s2, p3, f1, f1, f1, f1);

    }
}