package org.example;

public class Main {
    public static void main(String[] args) {

        PiInterface piInt = ()->3.1415;

        System.out.println(piInt.getPiValue());


    }


}