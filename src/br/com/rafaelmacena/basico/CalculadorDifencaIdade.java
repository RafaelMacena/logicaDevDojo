package br.com.rafaelmacena.basico;

public class CalculadorDifencaIdade {

	public static void main(String[] args) {

		String nome = "Paulo";
		int idadePaulo = 45;

		String nome2 = "Roberto";
		int idadeRoberto = 26;

		int diferencaIdadeEntrePauloERoberto = idadePaulo - idadeRoberto;

		System.out.println("A diferença de idade entre " + nome + " e " + nome2+ " è de "
				+ diferencaIdadeEntrePauloERoberto + " anos.");
	}

}
