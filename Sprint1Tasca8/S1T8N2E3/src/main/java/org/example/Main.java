package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elige una operación");
        System.out.println("Para sumar introduzca '+'");
        System.out.println("Para restar introduzca '-'");
        System.out.println("Para multiplicar introduzca '*'");
        System.out.println("Para dividir introduzca '/'");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Introduzca primer valor:");
        float fl1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Introduzca segundo valor:");
        float fl2 = scanner.nextFloat();
        scanner.close();

        MyInterface op;

        switch (ch) {
            case '+':
                op = (f1, f2) -> f1 + f2;
                break;
            case '-':
                op = (f1, f2) -> f1 - f2;
                break;
            case '*':
                op = (f1, f2) -> f1 * f2;
                break;
            case '/':
                op = (f1, f2) -> f1 / f2;
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }
        float resultado = op.operacion(fl1, fl2);

        System.out.println("Resultado: " + resultado);
    }
}