package br.com.rafaelmacena.lacosderepeticao;

public class Tabuada {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada Multiplic��o do n�mero: "+i);
			for (int j = 1; j <= 10; j++) {
				int tabuadaResultado = j*i;
				System.out.println( i + " X " + j + " = " + tabuadaResultado);

			}

		}

	}
}
