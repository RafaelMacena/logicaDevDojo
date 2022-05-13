package br.com.rafaelmacena.arrays;

import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] vetor1 = new int[2];
		int[] vetor2 = new int[2];
		int[] vetor3 = new int[2];
        
		String resultado = " ";
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Vetor 1, posição  " + i + ":");
			vetor1[i] = entrada.nextInt();
			System.out.println("Vetor 2, posição " + i + ":");
			vetor2[i] = entrada.nextInt();
			vetor3[i] = vetor1[i] * vetor2[i];
			resultado += vetor3[i] + ", " ;

		}
		
		System.out.println(resultado);
	}

}
