package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double frequencia;
        double media;

        System.out.print("Digite a frequência em porcentagem: ");
        frequencia = entrada.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else {

            System.out.print("Digite a média final: ");
            media = entrada.nextDouble();

            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media >= 5) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado por nota.");
            }

        }

    }
}
