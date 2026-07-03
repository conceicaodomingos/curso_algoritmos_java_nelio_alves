/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
 * Lembrando que, por definição, fatorial de 0 é 1.
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0308Fatorial {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Qual número você deseja calcular o fatorial? ");
		int n = leitura.nextInt();
		
		int f = 1;
		if (n == 0) {
			System.out.printf("\n%d! = %d", n, f);
		} else {
			for (int i = 1; i <= n; i++) {
				f *= i;
			}
			System.out.printf("\n%d! = %d", n, f);
		}
		
		leitura.close();
	}

}
