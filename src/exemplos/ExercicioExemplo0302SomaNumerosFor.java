/*
 * Fazer um programa que lê um valor inteiro n e depois n números inteiros. Ao final, mostrar a soma
 * dos n números lidos.
 */
package exemplos;

import java.util.Scanner;

public class ExercicioExemplo0302SomaNumerosFor {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números deseja somar? ");
		int cont = leitura.nextInt();
		
		int s = 0;
		System.out.println();
		
		for(int i = 1; i <= cont; i++) {
			System.out.printf("Digite o %dº número: ", i);
			int n = leitura.nextInt();
			s += n;
		}
		
		System.out.println("\nSoma dos números digitados = "+s);
		leitura.close();
	}

}
