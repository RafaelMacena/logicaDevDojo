package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class CategoriaTorneiNatacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe a idade: ");
		int idade = entrada.nextInt();

		if (idade < 11) {
			System.out.println(nome + " participará da categoria Infantil.");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println(nome + " participará da categoria Juvenil.");
		} else if (idade >= 16 && idade <= 20) {
			System.out.println(nome + " participará da categoria Pré-adulto.");
		} else {
			System.out.println(nome + " participará da categoria Adulto.");
		}
	}
}
