/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada 
 * peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e 
 * mostre o valor a ser pago. 
 */

package _01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0105ValorPagar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Código da Peça 1: ");
		int codigo1 = scanner.nextInt();
		
		System.out.print("Quantidade de Peças 1: ");
		int qtd1 = scanner.nextInt();
		
		System.out.print("Valor unitário da Peça 1: ");
		double valor1 = scanner.nextDouble();
		
		System.out.print("\nCódigo da Peça 2: ");
		int codigo2 = scanner.nextInt();
		
		System.out.print("Quantidade de Peças 2: ");
		int qtd2 = scanner.nextInt();
		
		System.out.print("Valor unitário da Peça 2: ");
		double valor2 = scanner.nextDouble();
		
		double valorPagar = qtd1 * valor1 + qtd2 * valor2;
		System.out.print(String.format("\nVALOR A PAGAR = U$ %.2f", valorPagar));
		
		scanner.close();
	}

}
