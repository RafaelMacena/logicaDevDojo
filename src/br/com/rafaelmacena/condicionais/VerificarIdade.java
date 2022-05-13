package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class VerificarIdade {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		TirarHabilitacao tirarHabilitacao = new TirarHabilitacao();

		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();

		String apto = tirarHabilitacao.verificarIdade(idade);

		System.out.println(apto);
	}

}
