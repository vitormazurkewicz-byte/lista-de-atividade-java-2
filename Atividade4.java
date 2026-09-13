package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        if (numero2 == 0) {
            System.out.println("A verificação não pode ser feita.");
        } else if (numero1 % numero2 == 0) {
            System.out.println("O primeiro número é múltiplo do segundo.");
        } else {
            System.out.println("O primeiro número não é múltiplo do segundo.");
        }

    }
}
