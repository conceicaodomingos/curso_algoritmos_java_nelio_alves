/*
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 
 * 1 = domingo, 2 = segunda e assim por diante). Escrever na tela o dia de semana correspondente. 
 * Utilize switch-case.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0205V2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor entre 1 e 7: ");
		int n = teclado.nextInt();
		
		System.out.print("\nDia de Semana: ");
		switch (n) {
			case 1 -> System.out.print("Domingo");
			case 2 -> System.out.print("Segunda");
			case 3 -> System.out.print("Terça");
			case 4 -> System.out.print("Quarta");
			case 5 -> System.out.print("Quinta");
			case 6 -> System.out.print("Sexta");
			case 7 -> System.out.print("Sábado");

			default -> System.out.print("Inválido!");
		}
		
		teclado.close();
	}

}
