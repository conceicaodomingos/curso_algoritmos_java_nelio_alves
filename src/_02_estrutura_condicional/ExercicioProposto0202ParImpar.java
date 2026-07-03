/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0202ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = teclado.nextInt();
		
		if (n % 2 == 0) {
			System.out.printf("\n%d é par", n);
		} else {
			System.out.printf("\n%d é ímpar", n);
		}
		
		teclado.close();
	}

}
