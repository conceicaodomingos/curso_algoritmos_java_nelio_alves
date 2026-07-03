/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o 
 * maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
 * considerando a primeira posição como 0 (zero).
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0405MaiorPosicao {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = leitura.nextInt();
		double[] v = new double[n];
		
		double maiorValor = 0.0;
		int maiorPosicao = 0;
		
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			v[i] = leitura.nextDouble();
			
			if (v[i] > maiorValor) {
				maiorValor = v[i];
				maiorPosicao = i;
			}
		}
		System.out.println("\nMAIOR VALOR = "+maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = "+maiorPosicao);
		
		leitura.close();
	}

}
