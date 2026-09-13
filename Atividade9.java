package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double bonus;
        double percentual;
        int tempo;

        System.out.print("Digite o salário: ");
        salario = entrada.nextDouble();

        System.out.print("Digite o tempo de casa em anos: ");
        tempo = entrada.nextInt();

        if (tempo < 1) {
            percentual = 0;
        } else if (tempo <= 3) {
            percentual = 5;
        } else if (tempo <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        bonus = salario * percentual / 100;

        System.out.printf("Percentual do bônus: %.2f%%%n", percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", bonus);

    }
}
