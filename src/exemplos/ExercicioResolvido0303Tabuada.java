/*
 * Leia um número inteiro n (2 < n < 1000). A seguir, mostre a tabuada de n.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0303Tabuada {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite um número para ver sua tabuada: ");
		int n = leitura.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n %d x %d = %d", n, i, (n * i));
		}

		leitura.close();
	}

}
