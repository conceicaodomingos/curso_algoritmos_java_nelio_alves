/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por 
 * linha, inclusive o X, se for o caso. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0304Impares {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int x = leitura.nextInt();
		
		System.out.printf("\nNúmeros ímpares entre 1 e %d são: \n",x);
		for (int i = 1; i <= x; i = i + 2) {
			System.out.println(i);
		}
		
		leitura.close();
	}

}
