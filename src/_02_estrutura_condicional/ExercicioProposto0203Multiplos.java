/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
 * "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem
 * poder ser digitados em ordem crescente ou decrescente. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0203Multiplos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1º número inteiro: ");
		int a = teclado.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		int b = teclado.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.printf("\n%d e %d são Múltiplos", a, b);
		} else {
			System.out.printf("\n%d e %d não são Múltiplos", a, b);
		}

		teclado.close();
	}

}
