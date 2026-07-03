/*
 * Fazer um programa para ler um número inteiro N e a altura de Npessoas. Armazene as N alturas em um 
 * vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

package exemplos;

import java.util.Scanner;

public class ExercicioExemplo0401 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Quantas alturas deseja ler? ");
		int n = leitura.nextInt();
		double[] vetor = new double[n];
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite a "+(i+1)+"ª altura: ");
			vetor[i] = leitura.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.println(String.format("\nAltura Média = %.2f", media));
		
		leitura.close();
	}

}
