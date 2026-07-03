/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
 * - Imprimir todos os elementos do vetor 
 * - Mostrar na tela a soma e a média dos elementos do vetor 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0402SomaVetores {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = leitura.nextInt();
		double[] v = new double[n];
		
		double soma = 0.0;
		for (int i = 0;  i < v.length; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			v[i] = leitura.nextDouble();
			soma += v[i];
		}
		
		System.out.print("\nVetor V = [");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i != (v.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		
		System.out.println(String.format("SOMA = %.2f", soma));
		System.out.println(String.format("MÉDIA = %.2f", (soma/v.length)));
		leitura.close();
	}

}
