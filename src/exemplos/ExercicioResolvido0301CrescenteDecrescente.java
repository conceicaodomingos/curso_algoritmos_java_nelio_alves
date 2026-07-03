/*
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
 * mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 * A entrada contém vários valores de teste. Cada caso contém dois valores inteiros X e Y. A leitura
 * deve ser encerrada ao ser fornecido valores iguais para X e Y.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0301CrescenteDecrescente {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = leitura.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = leitura.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.printf("\n%d e %d estão em ordem crescente \n\n", x, y);
			} else {
				System.out.printf("\n%d e %d estão em ordem decrescente \n\n", x, y);
			}
			
			System.out.print("Digite o valor de X: ");
			x = leitura.nextInt();
			
			System.out.print("Digite o valor de Y: ");
			y = leitura.nextInt();
		}
		
		System.out.println("\nOs valores digitados foram iguais, o programa terminou!");
		leitura.close();
	}
}
