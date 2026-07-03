/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste 
 * item. A seguir, calcule e mostre o valor da conta a pagar.
 * 						------------------------------------
 * 						CÓDIGO	ESPECIFICAÇÃO		PREÇO
 * 						------------------------------------
 * 						  1		Cachorro quente		U$ 4.00
 * 						  2		X-Salada			U$ 4.50
 * 						  3		X-Bacon				U$ 5.00
 * 						  4		Torrada simples		U$ 2.00
 * 						  5		Refrigerante		U$ 1.50
 */

package _02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0205ContaPagar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o Código do item: ");
		int codigo = teclado.nextInt();
		
		System.out.print("Digite a Quantidade: ");
		int qtd = teclado.nextInt();

		double preco = 0;
		
		switch (codigo) {
			case 1 -> preco = 4.00;
			case 2 -> preco = 4.50;
			case 3 -> preco = 5.00;
			case 4 -> preco = 2.00;
			case 5 -> preco = 1.50;

			default -> System.out.print("\nItem inválido!");
		}
		
		double valorPagar = qtd * preco;
		System.out.printf("\nTotal = U$ %.2f", valorPagar);
		
		teclado.close();
	}
}
