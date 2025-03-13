package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - PORCENTAGEM");
        System.out.println("3 - Fatorial");
        System.out.println("4 - Verificar se é par ou ímpar");

        System.out.println("Escolha uma das opções: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            soma();
        } else if (opcao == 2) {
            porcentagem();
        }  else if (opcao == 3) {
            fatoracao();
        }  else if (opcao == 4) {
            verificar();
        }else {
                System.out.println("Opção inválida!");
            }
    }

    public static void verificar() { // está em void porque nao irá retornar nada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número e retorno se é par ou ímpar: ");
        int num_a_verificar = scanner.nextInt();

        if (num_a_verificar %2 == 0) {
            System.out.println(num_a_verificar + " é par");
            //O if avalia a expressão booleana (num_a_verificar % 2 == 0):
            //Se a condição for true (verdadeira), ele executa o bloco dentro do if.
          // Se a condição for false (falsa), ele pula para o else e executa aquele bloco.
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
}
