/*
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N 
 * linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo
 *  do valor. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0310QuadradoCubo {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = leitura.nextInt();
		
		System.out.printf("Nº | Quadrado | Cubo\n");
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d	%d	%d\n", i, i*i, i*i*i);
		}
		
		leitura.close();
	}
}
