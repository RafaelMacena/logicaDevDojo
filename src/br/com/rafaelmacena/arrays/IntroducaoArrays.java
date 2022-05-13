package br.com.rafaelmacena.arrays;

import java.util.Scanner;

public class IntroducaoArrays {

	public static void main(String[] args) {

		double[] notas = new double[5];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe uma nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		double totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];

		}

		double media = totalNotas / notas.length;
		System.out.println("Média " + media);
	}

}
