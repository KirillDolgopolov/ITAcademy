package org.example;

public class Main {
    public static void main(String[] args) {

        IntForReverse reverseMyString = (stringForRev) -> new StringBuilder(stringForRev).reverse().toString();

        String origenString = "Abcdefghi";
        String resultString = "";

        resultString = reverseMyString.reverse(origenString);
        System.out.println(resultString);


    }
}