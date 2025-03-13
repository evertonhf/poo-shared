package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");

        soma();
        subtrai();
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }


    public static void subtrai() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 - numero2;

        System.out.println("O resultado da subtração é: " + resultado);
    }
}

