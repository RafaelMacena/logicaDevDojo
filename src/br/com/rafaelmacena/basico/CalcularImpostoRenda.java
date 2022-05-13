package br.com.rafaelmacena.basico;

import java.util.Scanner;

public class CalcularImpostoRenda {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ImpostoDeRenda imposto = new ImpostoDeRenda();

		System.out.println("Informe o valor do salário: ");
		double salario = entrada.nextDouble();

		System.out.println("Informe a porcentagem do imposto: ");
		double porcentagemImposto = entrada.nextDouble();

		double resultadoValorImposto = imposto.calcularImposto(salario, porcentagemImposto);

		System.out.println("O valor do imposto é R$" + resultadoValorImposto);
	}

}
