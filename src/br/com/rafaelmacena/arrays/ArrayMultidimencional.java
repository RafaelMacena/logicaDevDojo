package br.com.rafaelmacena.arrays;

import java.util.Scanner;

public class ArrayMultidimencional {

	public static void main(String[] args) {

		int[][] arrayMulti1 = new int[2][2];
//		arrayMulti1[0][0] = 22;
//		arrayMulti1[0][1] = 11;
//		arrayMulti1[1][0] = 44;
//		arrayMulti1[1][1] = 55;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < arrayMulti1.length; i++) {
			for (int j = 0; j < arrayMulti1[i].length; j++) {
				System.out.println("Digite o valor da posi��o [" + i + "] [" + j + "] ");
				arrayMulti1[i][j] = entrada.nextInt();

			}

		}
		for (int i = 0; i < arrayMulti1.length; i++) {
			for (int j = 0; j < arrayMulti1[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]=" + arrayMulti1[i][j]);

			}
		}
	}

}
