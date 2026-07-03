/*
 *  Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. 
 *  Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0501DiagonalPrincipalNegativos {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Qual é a ordem da matriz: ");
		int n = leitura.nextInt();
		int[][] m = new int[n][n];
		
		int numerosNegativos = 0;
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Elemento "+(i+1)+(j+1)+" = ");
				m[i][j] = leitura.nextInt();
				
				if (m[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		
		System.out.println("\nA matriz digitada é:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nDiagonal principal: ");
		System.out.print("{");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i][i]);
			if (i < m.length - 1) {
		        System.out.print(" ");
		    }
		}
		System.out.print("}");
		System.out.println("\n\nNúmeros negativos = "+numerosNegativos);
		
		leitura.close();
	}
}
