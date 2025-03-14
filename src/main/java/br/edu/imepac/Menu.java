package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - PORCENTAGEM");
        System.out.println("3 - FATORAÇÃO");
        System.out.println("4 - MULTIPLICACAO");
        System.out.println(("5 - SUB"));
        System.out.println("6 - Inversão de Palavra");
        System.out.println("7 - MATRIZ");
        System.out.println("8 - V OU F");
        System.out.println(("9 - DIV"));

        System.out.println("Escolha uma das opções: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            soma();
        } else if (opcao == 2) {
            porcentagem();
        } else if (opcao == 3) {
            fatoracao();
        } else if (opcao == 4) {
            multiplicacao();
        } else if (opcao == 5) {
            sub();
        } else if (opcao == 6) {
            inverterPalavra();
        } else if (opcao == 7) {
            matriz();
        } else if (opcao == 8) {
            VouF();
        } else if (opcao == 9) {
            divisao();
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

    public static void VouF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String input = scanner.nextLine();

        boolean isReal = isNumeroReal(input);

        if (isReal) {
            System.out.println("Verdadeiro: O número é real.");
        } else {
            System.out.println("Falso: O número não é real.");
        }
    }

    public static boolean isNumeroReal(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void matriz() {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("Digite os elememtos da Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                System.out.println("Elemento [" + i + "," + x + "]: ");
                matriz[i][x] = scanner.nextInt();
            }
        }
        System.out.println("Matriz ");
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                System.out.print(matriz[i][x] + "");
            }
            System.out.println();
        }
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

    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("O resultado da multiplicação é " + numero1 * numero2);
    }

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("A subtração dos dois números é: " + (num1 - num2));

    }

    public static void divisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("a divisão dos numeros é: " + (numero1 / numero2));
    }


    public static void inverterPalavra() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite uma PALAVRA: ");
        String txl = read.nextLine();

        StringBuilder palavraInvertida = new StringBuilder(txl);

        System.out.println("Palavra invertida: " + palavraInvertida.reverse().toString());
    }
}








