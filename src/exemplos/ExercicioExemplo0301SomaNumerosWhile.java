/*
 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final, mostrar a soma dos
 * números lidos.
 */
package exemplos;

import java.util.Scanner;

public class ExercicioExemplo0301SomaNumerosWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o 1º número [digite 0 para parar]: ");
		int n = teclado.nextInt();
		
		int s = 0;
		while (n != 0) {
			s += n;
			System.out.print("Digite o próximo número [digite 0 para parar]: ");
			n = teclado.nextInt();
		}
		
		System.out.printf("\nSoma dos números lidos = %d",s);
		teclado.close();
	}

}
