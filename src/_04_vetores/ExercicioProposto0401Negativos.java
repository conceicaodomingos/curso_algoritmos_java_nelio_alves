/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e 
 * armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0401Negativos {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = leitura.nextInt();
		int[] v = new int[n];

		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			v[i] = leitura.nextInt();
		}

		System.out.println("\nNÚMEROS NEGATIVOS:");
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0) {
				System.out.println(v[i]);
			}
		}
		leitura.close();
	}

}
