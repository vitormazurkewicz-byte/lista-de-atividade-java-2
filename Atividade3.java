package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperatura;
        double umidade;

        System.out.print("Digite a temperatura em Celsius: ");
        temperatura = entrada.nextDouble();

        System.out.print("Digite a umidade em porcentagem: ");
        umidade = entrada.nextDouble();

        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo.");
        }

        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa.");
        }

        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada.");
        }

    }
}
