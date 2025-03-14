package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - PORCENTAGEM");
        System.out.println("3 - Fatorial");
        System.out.println(("4 - SUB"));
        System.out.println("5 - Inversão de Palavra");


        System.out.println("Escolha uma das opções: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            soma();
        } else if (opcao == 2) {
            porcentagem();
        } else if (opcao == 3) {
            fatoracao();
        } else if (opcao == 4) {
            sub();
        } else if (opcao == 5) {
            inverterPalavra();
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

    public static void porcentagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR TOTAL: ");
        double total = scanner.nextDouble();
        System.out.println("DIGITE A PORCENTAGEM (%): ");
        double porcentagem = scanner.nextDouble();

        double resultado = (total * porcentagem) / 100;
        System.out.println("O RESULTADO DA PORCENTAGEM É: " + resultado);
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

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("A subtração dos dois números é: " + (num1 - num2));

    }



    public static void inverterPalavra() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite uma PALAVRA: ");
        String txl = read.nextLine();

        StringBuilder palavraInvertida = new StringBuilder(txl);

        System.out.println("Palavra invertida: " + palavraInvertida.reverse().toString());
    }
}


