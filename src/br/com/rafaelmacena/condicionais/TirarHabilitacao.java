package br.com.rafaelmacena.condicionais;

public class TirarHabilitacao {

	public String verificarIdade(int idade) {

		if (idade > 18) {
			return "Adulto, apto a tirar habilitação.";
		} else {
			return "Sua idade não permite tirar habilitação";
		}
	}

}
