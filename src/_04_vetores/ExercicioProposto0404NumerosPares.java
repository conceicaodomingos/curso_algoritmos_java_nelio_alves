/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela 
 * todos os números pares, e também a quantidade de números pares.
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0404NumerosPares {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int n = leitura.nextInt();
		int[] v = new int[n];
		
		int numerosPares = 0;
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			v[i] = leitura.nextInt();
		}
		
		System.out.print("\nNÚMEROS PARES: {");
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				System.out.print(v[i]);
				if (i != v.length - 1) {
					System.out.print(", ");
				}
				numerosPares++;
			}
		}
		
		System.out.print("}\n");
		System.out.println("QUANIDADE DE PARES = "+numerosPares);
		
		leitura.close();
	}

}
