/*
 * Ler um número inteiro N e calcular todos os seus divisores. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0309Divisores {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Qual número deseja calcular seus divisores? ");
		int n = leitura.nextInt();
		
		System.out.printf("\nDivisores de %d = {", n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d", i);
				if (i != n) {
					System.out.print(", ");
				}
			}	
		}
		System.out.println("}");
		leitura.close();
	}
}
