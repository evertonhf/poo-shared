package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");

        soma();
        verificar();
    }

    public static void verificar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número e retorno se é par: ");
        int num_a_verificar = scanner.nextInt();

        if (num_a_verificar %2 == 0) {
            System.out.println(num_a_verificar + " é par");
        } else {
            System.out.println(num_a_verificar + " é impar");
        }

    }



    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }
}
