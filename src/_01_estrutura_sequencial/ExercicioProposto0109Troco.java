/*
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
 * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
 * e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
 * mostrar o valor do troco a ser devolvido ao cliente. 
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0109Troco {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: $ ");
		double preco = leitura.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		int qtd = leitura.nextInt();
		
		System.out.print("Dinheiro recebido: $ ");
		double dinheiro = leitura.nextDouble();

		double troco = dinheiro - preco * qtd;
		System.out.printf("\nTroco = $ %.2f", troco);
		
		leitura.close();
	}

}
