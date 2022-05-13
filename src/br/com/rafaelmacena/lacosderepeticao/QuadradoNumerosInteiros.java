package br.com.rafaelmacena.lacosderepeticao;

public class QuadradoNumerosInteiros {
    public static void main(String[] args) {
    	
		for (int i = 15; i <= 200; i++) {
			int numQuadrado = Math.multiplyExact(i, i);
			System.out.println(numQuadrado);
		}
	}
}
