package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - Fatorial");

        System.out.println("Escolha uma das opções: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            soma();
        } else if (opcao == 2) {
            fatoracao();
        } else {
            System.out.println("Opção inválida!");
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
    public static void fatoracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para fatoração: ");
        int numero = scanner.nextInt();

        System.out.print("Fatores primos de " + numero + " são: ");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        System.out.println();
    }
}
