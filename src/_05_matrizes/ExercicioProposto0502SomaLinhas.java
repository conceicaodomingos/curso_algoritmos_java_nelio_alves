/*
 * Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz de 
 * M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor seja 
 * a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.  
 */

package _05_matrizes;

import java.util.Scanner;

public class ExercicioProposto0502SomaLinhas {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = leitura.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = leitura.nextInt();

		double[][] matriz = new double[m][n];
		double[] vetor = new double[m];

		for (int i = 0; i < m; i++) {
			System.out.println("\nDigite os elementos da " + (i + 1) + "a linha:");

			vetor[i] = 0.0;
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
				matriz[i][j] = leitura.nextInt();

				vetor[i] += matriz[i][j];
			}
		}

		System.out.println("\nA matriz digitada é:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println("\nVETOR GERADO: ");
		System.out.print("[");
		for (int i = 0; i < m; i++) {
			System.out.print(vetor[i]);
			if (i < m - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

		leitura.close();
	}

}
