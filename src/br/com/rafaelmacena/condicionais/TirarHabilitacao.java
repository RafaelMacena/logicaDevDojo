package br.com.rafaelmacena.condicionais;

public class TirarHabilitacao {

	public String verificarIdade(int idade) {

		if (idade > 18) {
			return "Adulto, apto a tirar habilita��o.";
		} else {
			return "Sua idade n�o permite tirar habilita��o";
		}
	}

}
