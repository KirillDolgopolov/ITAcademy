package org.example;

public class Main {
    public static void main(String[] args) {

        String s1 = "Pim";
        String s2=" Pum";
        String s3=" Pam";

        NoGenericMethods miClass= new NoGenericMethods(s1,s2,s3);
        System.out.println(miClass);

        Integer i1 = 35;
        Character ch1 = 'X';
        Boolean b1 = true;


        NoGenericMethods miClass2= new NoGenericMethods(i1,ch1,b1);
        System.out.println(miClass2);

    }
}