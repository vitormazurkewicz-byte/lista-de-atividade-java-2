package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo;
        double limite;
        double valor;

        System.out.print("Digite o saldo da conta: ");
        saldo = entrada.nextDouble();

        System.out.print("Digite o limite diário de saque: ");
        limite = entrada.nextDouble();

        System.out.print("Digite o valor solicitado: ");
        valor = entrada.nextDouble();

        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {

            if (valor > limite) {
                System.out.println("Valor ultrapassa o limite diário.");
            } else {

                saldo = saldo - valor;

                System.out.printf("Saque efetuado.%n");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);

            }

        }

    }
}
