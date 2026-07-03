/*
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 
 * 1 = domingo, 2 = segunda e assim por diante). Escrever na tela o dia de semana correspondente. 
 * Utilize if-else.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioResolvido0205V1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor entre 1 e 7: ");
		int n = teclado.nextInt();
		
		System.out.print("\nDia de Semana: ");
		if (n == 1) {
			System.out.println("Domingo");
		} else if(n == 2) {
			System.out.println("Segunda");
		} else if (n == 3) {
			System.out.println("Terça");
		} else if (n == 4) {
			System.out.println("Quarta");
		} else if (n == 5) {
			System.out.println("Quinta");
		} else if (n == 6) {
			System.out.println("Sexta");
		} else if (n == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Inválido!");
		}
		
		teclado.close();
	}

}
