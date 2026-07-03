/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0407AbaixoDaMedia {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = leitura.nextInt();
		double[] v = new double[n];
		
		double soma = 0.0; 
		for (int i = 0; i < v.length; i++) {
			System.out.print((i+1)+"º elemento do vetor: ");
			v[i] = leitura.nextDouble();
			soma += v[i]; 
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
		
		double media = soma / v.length;
		System.out.println(String.format("\nMEDIA DOS ELEMENTOS DO VETOR = %.3f", media));
		
		System.out.print("ELEMENTOS ABAIXO DA MÉDIA: {");
		double abaixoMedia = 0.0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) {
				abaixoMedia = v[i];
				System.out.print(abaixoMedia+"  ");
			}
		}
		System.out.print("}");
		
		leitura.close();
	}
}
