/*
 * Ler uma matriz de números reais, depois mostrar a soma dos elementos da diagonal principal da matriz.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0502SomaDiagonalPrincipal {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz: ");
		int n = leitura.nextInt();
		
		double[][] matriz = new double[n][n];
		double somaElementosDiagonalPrincipal = 0.0;
		
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento "+(i+1)+(j+1)+" = ");
				matriz[i][j] = leitura.nextDouble();
			}
		}
		
		System.out.println("\nA matriz digitada é:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			somaElementosDiagonalPrincipal += matriz[i][i];
		}
		System.out.println("Soma dos elementos da diagonal principal = "+somaElementosDiagonalPrincipal);
		leitura.close();
	}
}
