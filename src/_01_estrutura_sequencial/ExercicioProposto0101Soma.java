/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com 
 * uma mensagem explicativa. 
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0101Soma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1º Valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("2º Valor: ");
		int v2 = scanner.nextInt();
		
		System.out.println("\nSOMA = " + (v1 + v2));
		scanner.close();
	}

}
