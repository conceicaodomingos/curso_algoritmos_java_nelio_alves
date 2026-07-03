/*
 * Uma lanchonete possui vários produtos. Cada produto possui um código e um preço. Você deve fazer um
 * programa para ler o código e a quantidade comprada de um produto (suponha um código válido), e daí 
 * informar qual o valor a ser pago, com duas casas decimais, conforme tabela de produtos ao lado.
 * 						-------------------
 * 						CÓDIGO		PREÇO
 * 						-------------------
 * 						  1			U$ 4.00
 * 						  2			U$ 4.50
 * 						  3			U$ 5.00
 * 						  4			U$ 2.00
 * 						  5			U$ 1.50
 * 						-------------------
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0213Lanchonete {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Código do produto comprado: ");
		int codigo = leitura.nextInt();
		
		System.out.print("Quantidade comprada: ");
		int qtd = leitura.nextInt();

		double preco = 0;
		
		switch (codigo) {
			case 1 -> preco = 5.00;
			case 2 -> preco = 3.50;
			case 3 -> preco = 4.80;
			case 4 -> preco = 8.90;
			case 5 -> preco = 7.32;

			default -> System.out.print("\nItem inválido!");
		}
		
		double valorPagar = qtd * preco;
		System.out.printf("\nTotal = U$ %.2f", valorPagar);
		
		leitura.close();
	}
}
