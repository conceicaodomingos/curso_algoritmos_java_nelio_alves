/*
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. O 
 * programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e 
 * o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido 
 * ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o 
 * valor restante conforme exemplo. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0209TrocoVerificado {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Preço unitário do produto: $ ");
		double preco = leitura.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		int qtd = leitura.nextInt();
		
		System.out.print("Dinheiro recebido: $ ");
		double dinheiro = leitura.nextDouble();

		double troco = dinheiro - preco * qtd;
		double falta = preco * qtd - dinheiro;
		
		if (troco > 0.0) {
			System.out.printf("\nTroco = $ %.2f", troco);
		} else {
			System.out.println(String.format("\nDINHEIRO INSUFICIENTE. FALTAM $ %.2f", falta));
		}
		
		leitura.close();
	}

}
