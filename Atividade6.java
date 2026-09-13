package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double compra;
        double frete;
        double total;

        System.out.print("Digite o valor da compra: ");
        compra = entrada.nextDouble();

        if (compra >= 199.00) {
            frete = 0.00;
        } else {
            frete = 24.90;
        }

        total = compra + frete;

        System.out.printf("Valor do frete: R$ %.2f%n", frete);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

    }
}
