/*
 * Fazer um programa para ler dois números inteiros M e N,e depois ler uma matriz de M linhas por N 
 * colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X 
 * que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e 
 * abaixo de X, quando houver, conforme exemplo.
 */

package _05_matrizes;

import java.util.Scanner;

public class ExercicioProposto0501Matrizes {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Qual o número de linhas da matriz: ");
		int m = leitura.nextInt();
		
		System.out.print("Qual o número de colunas da matriz: ");
		int n = leitura.nextInt();
		
		int[][] matriz = new int[m][n];
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento "+(i+1)+(j+1)+" = ");
				matriz[i][j] = leitura.nextInt();
			}
		}
		
		System.out.println("\nA matriz digitada é:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.print("\nDigite um número pertencente a matriz: ");
		int x = leitura.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Posição em que se encontra o número "+x+": "+i+","+j);
				}
			}
		}
		
		leitura.close();
	}
}
