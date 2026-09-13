package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hora;

        System.out.print("Digite a hora do dia: ");
        hora = entrada.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida.");
        }

    }
}
