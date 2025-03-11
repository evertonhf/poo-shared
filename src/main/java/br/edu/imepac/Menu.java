package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - PORCENTAGEM");

        soma();
        porcentagem();
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }

    public static void porcentagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR TOTAL: ");
        double total = scanner.nextDouble();
        System.out.println("DIGITE A PORCENTAGEM (%): ");
        double porcentagem = scanner.nextDouble();

        double resultado = (total * porcentagem) / 100;
        System.out.println("O RESULTADO DA PORCENTAGEM É: " + resultado);
    }
}
