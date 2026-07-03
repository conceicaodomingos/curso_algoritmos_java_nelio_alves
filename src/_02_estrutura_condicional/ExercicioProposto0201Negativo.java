/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0201Negativo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = teclado.nextInt();
		
		if (n < 0) {
			System.out.printf("\n%d É NEGATIVO", n);
		} else {
			System.out.printf("\n%d NÃO É NEGATIVO", n);
		}
		
		teclado.close();
	}

}
