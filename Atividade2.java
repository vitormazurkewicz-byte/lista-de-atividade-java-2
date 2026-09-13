
package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int absoluto;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        absoluto = Math.abs(numero);

        if (numero > 0) {
            System.out.println("É positivo.");
        }

        if (numero % 2 == 0) {
            System.out.println("É par.");
        }

        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5.");
        }

        if (absoluto >= 10 && absoluto <= 99) {
            System.out.println("Tem dois dígitos.");
        }

    }
}
