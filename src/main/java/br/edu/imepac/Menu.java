package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");

        soma();
        multiplicacao();

    }
    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }
    public static void multiplicacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("O resultado da multiplicação é " + numero1 * numero2 );
    }
}
