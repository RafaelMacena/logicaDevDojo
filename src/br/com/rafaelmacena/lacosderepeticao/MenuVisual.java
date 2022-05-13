package br.com.rafaelmacena.lacosderepeticao;

import java.util.Scanner;

public class MenuVisual {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int operacao = 0;
		
		while (operacao != 3) {
			System.out.println(" Escolha uma operação");
			System.out.println(" Opção 1 Calcular imposto"); 
			System.out.println(" Opção 2 Dopositar salário ");
			System.out.println(" Opção 3 Sair ");
			operacao = entrada.nextInt();
					


		}
		System.out.println(" Programa encerado. ");
	}
}
