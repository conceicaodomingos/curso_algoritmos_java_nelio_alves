/*
 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida. 
 * Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também se é
 * POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas 
 * NULO. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0313ParImpar {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = leitura.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite um número: ");
			int x = leitura.nextInt();
			
			if (x != 0) {
				if (x % 2 != 0) {
					System.out.print(x+" é ÍMPAR");
				} else {
					System.out.print(x+" é PAR");
				}
			}
			
			if (x > 0) {
				System.out.println(" e POSITIVO");
			} else if (x < 0) {
				System.out.println(" e NEGATIVO");
			} else {
				System.out.println("NULO");
			}
		}
		
		leitura.close();
	}
	
}
