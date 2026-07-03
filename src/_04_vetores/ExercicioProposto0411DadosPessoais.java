/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que 
 * calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de 
 * homens.
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0411DadosPessoais {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = leitura.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		double menorAltura = 10.0;
		double maiorAltura = 0.0;
		double somaAlturasMulheres = 0.0;
		int numeroMulheres = 0;
		int numeroHomens = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = leitura.nextDouble();
			System.out.print("Género da " + (i + 1) + "a pessoa: ");
			generos[i] = leitura.next().charAt(0);

			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}

			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}

			if (generos[i] == 'F') {
				somaAlturasMulheres += alturas[i];
				numeroMulheres++;
			} else {
				numeroHomens++;
			}
		}

		System.out.println("\nMenor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
		System.out.println(
				"Média das alturas das mulheres = " + String.format("%.2f", (somaAlturasMulheres / numeroMulheres)));
		System.out.println("Número de homens = " + numeroHomens);

		leitura.close();
	}
}
