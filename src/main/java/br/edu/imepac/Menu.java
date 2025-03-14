package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");
        System.out.println("2 - MATRIZ");

        soma();
        matriz();
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
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

        System.out.println("Matriz " );
        for (int i = 0; i < 2; i++){
            for (int x = 0; x < 2; x++){
                System.out.print(matriz[i][x] + "");
            }
            System.out.println();
            }
        }


}

