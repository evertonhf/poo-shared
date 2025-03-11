package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");

        soma();
        inverterPalavra();
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }

    public static void inverterPalavra() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite uma PALAVRA: ");
        String txl = read.nextLine();

        StringBuilder palavraInvertida = new StringBuilder(txl);

        System.out.println("Palavra invertida: " + palavraInvertida.reverse().toString());
    }
}


