package br.com.seunome.lista02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Digite o usuário: ");
        usuario = entrada.nextLine();

        if (usuario.equals("admin")) {

            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }

        } else {
            System.out.println("Usuário não encontrado.");
        }

    }
}
