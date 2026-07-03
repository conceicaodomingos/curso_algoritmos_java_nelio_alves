/*
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
 * Perguntar se o usuário deseja repetir (S/N). Caso o usuário digite "S", repetir o programa.
 * Fórmula: F = (9C/5 + 32).
 */

package exemplos;

import java.util.Scanner;

public class ExercicioExemplo0303ConversaoV1 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		char resp = 's';
		
		while (resp != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = leitura.nextDouble();
			
			double f = 1.8 * c + 32;
			System.out.printf("Equivalente em Fahrenheit = %.1f \n", f);
			System.out.print("Deseja repetir? [S/N]: ");
			resp = leitura.next().charAt(0);
			System.out.println();
		}

		leitura.close();
	}
}
