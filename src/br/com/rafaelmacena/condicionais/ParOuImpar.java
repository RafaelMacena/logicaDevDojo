package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
        System.out.println("informe o n�mero: ");
		int numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Numero par.");
		} else {
			System.out.println("Numero �mpar.");
		}

	}

}
