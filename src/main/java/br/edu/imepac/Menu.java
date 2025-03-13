package br.edu.imepac;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("MENU ------ ");
        System.out.println("1 - SOMA");

        soma();

    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }

    public static class MediaNotas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a primeira nota: ");
            double nota1= scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2= scanner.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3= scanner.nextDouble();

            double media= (nota1+nota2+nota3)/3;
            System.out.println("A média das notas é: " + media);

        }
    }
}
