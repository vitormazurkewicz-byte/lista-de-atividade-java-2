package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;

        System.out.print("Digite o número do mês: ");
        mes = entrada.nextInt();

        switch (mes) {

            case 1, 3, 5, 7, 8, 10, 12 ->
                System.out.println("O mês tem 31 dias.");

            case 4, 6, 9, 11 ->
                System.out.println("O mês tem 30 dias.");

            case 2 ->
                System.out.println("O mês tem 28 dias.");

            default ->
                System.out.println("Mês inválido.");

        }

    }
}
