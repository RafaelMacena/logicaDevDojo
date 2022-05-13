package br.com.rafaelmacena.condicionais;

public class CalcularImposto {

	private static final int TOTAL_100 = 100;

	public static void main(String[] args) {

		double salario = 2500;
		double porcentagem;
		double valorImposto = 0;

		if (salario > 4500) {

			porcentagem = 30;
			valorImposto = (salario * porcentagem) / TOTAL_100;

		} else if (salario >= 3000 && salario <= 4500) {

			porcentagem = 15;
			valorImposto = (salario * porcentagem) / TOTAL_100;
		} else {

			porcentagem = 5;
			valorImposto = (salario * porcentagem) / TOTAL_100;

		}

		System.out.println("O valor do imposto é R$ " + valorImposto + ", " + porcentagem + "% do seu salário.");

	}

}
