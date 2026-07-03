/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado,
 * mostrar a mensagem "NENHUM NUMERO PAR" 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0408MediaPares {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = leitura.nextInt();
		int[] v = new int[n];
		
		int qtdPares = 0;
		double somaPares = 0.0; 
		for (int i = 0; i < v.length; i++) {
			System.out.print((i+1)+"º elemento do vetor: ");
			v[i] = leitura.nextInt();
			if (v[i] % 2 == 0) {
				somaPares += v[i];
				qtdPares++;
			} 
		}
		
		System.out.println("\nVETOR DIGITADO:");
		System.out.print("[");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i != (v.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		if (qtdPares == 0) {
			System.out.println("\nNENHUM NÚMERO PAR");
		} else {
			double media = (double) somaPares / qtdPares;
			System.out.println(String.format("\n\nMEDIA DOS PARES = %.1f", media));
		}
		
		leitura.close();
	}
}
