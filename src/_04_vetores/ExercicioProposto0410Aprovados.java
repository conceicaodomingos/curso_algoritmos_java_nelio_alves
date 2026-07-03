/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 
 * 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os 
 * nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual
 * a 6.0 (seis). 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0410Aprovados {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = leitura.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nDados do " + (i + 1) + "º aluno:");
			System.out.print("Nome: ");
			leitura.nextLine();
			nome[i] = leitura.nextLine();
			System.out.print("Nota do 1º semestre: ");
			nota1[i] = leitura.nextDouble();
			System.out.print("Nota do 2º semestre: ");
			nota2[i] = leitura.nextDouble();

			media[i] = (nota1[i] + nota2[i]) / 2.0;
		}

		System.out.println("\nALUNOS APROVADOS:");
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}

		leitura.close();
	}
}
