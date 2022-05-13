package br.com.rafaelmacena.lacosderepeticao;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		final String login = "root";

		final String senha = "DevDojo";

		Scanner entrada = new Scanner(System.in);

		while (true) {

			System.out.println("Digite seu login");
			String loginDiditado = entrada.nextLine();

			System.out.println("Digite sua senha");
			String senhaDigitada = entrada.nextLine();

			if (login.equals(loginDiditado) && senha.equals(senhaDigitada)) {
				System.out.println("ACESSO CONCEDIDO\nConectando!!");
 				break;
			}
			System.out.println("ACESSO NEGADO\nLoogin ou senha inválido.");
		}
	}

}
