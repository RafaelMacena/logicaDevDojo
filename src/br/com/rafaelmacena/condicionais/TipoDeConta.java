package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class TipoDeConta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Intorme qual o tipo da conta:  CONTA-POUPANÇA,  CONTA_CORRENTE,  CONTA_INVESTIMENTO? ");
		String tipoDeConta = entrada.nextLine();

		switch (tipoDeConta) {
		case "CONTA-POUPANÇA":
			System.out.println(tipoDeConta + "  0.05% de juros.");
			break;
		case "CONTA-CORRENTE":
			System.out.println(tipoDeConta + "  0.02% de juros.");
			break;
		case "CONTA-INVESTIMENTO":
			System.out.println(tipoDeConta + "  0.01% de juros.");
			break;
		default:
			System.out.println(" TIPO DE CONTA INVÁLIDO");
			break;
		}
	}

}
