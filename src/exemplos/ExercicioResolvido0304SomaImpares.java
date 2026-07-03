/*
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números ímpares entre eles.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0304SomaImpares {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = leitura.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = leitura.nextInt();
		
		int min;
		int max;
		
		if (x < y) {
			min = x + 1;
			max = y - 1;
		} else {
			min = y + 1;
			max = x - 1;
		}
		
		int s = 0;
		for (int i = min; i <= max; i++) {
			if (i % 2 != 0) {
				s += i;
			}
		}

		System.out.printf("\nSoma dos números ímpares entre %d e %d = %d", x, y, s);
		leitura.close();
	}

}
