package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double limite;
        double velocidade;
        double percentual;

        System.out.print("Digite a velocidade máxima da via: ");
        limite = entrada.nextDouble();

        System.out.print("Digite a velocidade do veículo: ");
        velocidade = entrada.nextDouble();

        if (limite <= 0) {
            System.out.println("Limite inválido.");
        } else if (velocidade <= limite) {
            System.out.println("Dentro do limite. Não há multa.");
        } else {

            percentual = ((velocidade - limite) / limite) * 100;

            if (percentual <= 20) {
                System.out.println("Infração média.");
            } else if (percentual <= 50) {
                System.out.println("Infração grave.");
            } else {
                System.out.println("Infração gravíssima.");
            }

        }

    }
}
