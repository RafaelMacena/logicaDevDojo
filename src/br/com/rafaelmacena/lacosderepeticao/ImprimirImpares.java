package br.com.rafaelmacena.lacosderepeticao;

import java.util.Scanner;

public class ImprimirImpares {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();

		int contador = 0;

		while (contador <= numero) {
			if (contador % 2 == 1) {
				System.out.println("impares: " + contador);
			}
			contador++;

		}
	}
}
