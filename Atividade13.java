package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        int opcao;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {

            case 1 -> {
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
            }

            case 2 -> {
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
            }

            case 3 -> {
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %.2f%n", resultado);
            }

            case 4 -> {

                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("Resultado: %.2f%n", resultado);
                }

            }

            default -> System.out.println("Opção inválida.");

        }

    }
}
