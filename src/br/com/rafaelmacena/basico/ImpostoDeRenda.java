package br.com.rafaelmacena.basico;

public class ImpostoDeRenda {


	private static final int TOTAL_100 = 100;

	public double calcularImposto(double salario, double porcentagemImposto) {

		double valorImposto = (salario * porcentagemImposto) / TOTAL_100;
		return valorImposto;

	}

}
