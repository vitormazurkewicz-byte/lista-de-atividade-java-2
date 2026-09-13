package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tipo;
        int horas;
        double tarifa;
        double valor;
        double desconto = 0;
        double valorFinal;
        String cupom;

        System.out.println("1 - Carro");
        System.out.println("2 - Moto");

        System.out.print("Digite o tipo de veículo: ");
        tipo = entrada.nextInt();

        switch (tipo) {

            case 1 -> tarifa = 8.00;

            case 2 -> tarifa = 5.00;

            default -> {
                System.out.println("Opção inválida.");
                return;
            }

        }

        System.out.print("Digite a quantidade de horas: ");
        horas = entrada.nextInt();

        valor = tarifa * horas;

        entrada.nextLine();

        System.out.print("O cliente tem cupom? (sim/nao): ");
        cupom = entrada.nextLine();

        if (cupom.equalsIgnoreCase("sim")) {

            if (valor >= 50.00) {
                desconto = valor * 0.20;
                System.out.println("Desconto de 20% aplicado.");
            } else {
                System.out.println("O cupom vale apenas para valores acima de R$ 50,00.");
            }

        }

        if (horas > 12) {
            System.out.println("Aviso: permanência longa.");
        }

        if (horas > 24) {
            System.out.println("Aviso: cobrança de diária.");
        }

        if (horas <= 2) {
            System.out.println("Permanência curta.");
        } else if (horas <= 6) {
            System.out.println("Permanência média.");
        } else {
            System.out.println("Permanência longa.");
        }

        valorFinal = valor - desconto;

        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

    }
}
