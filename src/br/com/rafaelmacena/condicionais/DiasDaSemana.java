package br.com.rafaelmacena.condicionais;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um numero ente 1 e 7:");
		int diaSemana = entrada.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println(diaSemana + " segunda-feira.");
			break;
		case 2:
			System.out.println(diaSemana + " terça-feira.");
			break;
		case 3:
			System.out.println(diaSemana + " quarta-feira.");
			break;
		case 4:
			System.out.println(diaSemana + " quinta-feira");
			break;
		case 5:
			System.out.println(diaSemana + " sexta-feira.");
			break;
		case 6:
			System.out.println(diaSemana + " sabádo.");
			break;
		case 7:
			System.out.println(diaSemana + " domingo");
			break;
		default:
			System.out.println("Numero Inválido.");
		}
	}

}
