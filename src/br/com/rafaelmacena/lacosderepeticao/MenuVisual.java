package br.com.rafaelmacena.lacosderepeticao;

import java.util.Scanner;

public class MenuVisual {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int operacao = 0;
		
		while (operacao != 3) {
			System.out.println(" Escolha uma opera��o");
			System.out.println(" Op��o 1 Calcular imposto"); 
			System.out.println(" Op��o 2 Dopositar sal�rio ");
			System.out.println(" Op��o 3 Sair ");
			operacao = entrada.nextInt();
					


		}
		System.out.println(" Programa encerado. ");
	}
}
