package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class CadastroUsuario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String usuario = entrada.nextLine();

		if (usuario.equals("") || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase( "administrador")) {
			System.out.println( "Usuario inválido");
		} else {
			System.out.println(usuario + " cadastrado com sucesso!!");
		}

	}

}
