package br.com.rafaelmacena.condicionais;

public class AlistamentoMilitar {

	public static void main(String[] args) {

		char sexo = 'F';
		int idade = 19;

		if ((sexo == 'M' || sexo == 'F') && idade < 18) {
			System.out.println("Alistamento n�o permitido.");

		} else if (sexo == 'F' && idade >= 18) {
			System.out.println("Voc� deseja se alistar? ");

		} else if ((sexo == 'M' || sexo == 'F') && idade >= 18) {
			System.out.println("Alistamento obrigat�rio");
		}
	}

}
