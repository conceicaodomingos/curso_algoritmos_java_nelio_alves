/*
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
 */
package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0203Menor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite o 2º número: ");
		int n2 = scanner.nextInt();
		
		System.out.print("Digite o 3º número: ");
		int n3 = scanner.nextInt();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("\nMENOR NÚMERO = "+n1);
		} else if (n2 < n3) {
			System.out.println("\nMENOR NÚMERO = "+n2);
		} else {
			System.out.println("\nMENOR NÚMERO = "+n3);
		}

		scanner.close();
	}

}
