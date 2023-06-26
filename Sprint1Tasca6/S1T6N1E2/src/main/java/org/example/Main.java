package org.example;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Jack", "Smith", 88);
        String s1 = "Hello world";
        int int1 = 666;

        GenericMethods.imprimirArgumentos(p1, s1, int1);
        System.out.println();
        GenericMethods.imprimirArgumentos(s1, int1, p1);


    }
}