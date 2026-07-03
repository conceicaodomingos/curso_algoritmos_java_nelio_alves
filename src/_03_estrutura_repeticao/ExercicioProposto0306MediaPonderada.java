/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
 * teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada 
 * para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor 
 * tem peso 3 e o terceiro valor tem peso 5. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0306MediaPonderada {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);	

		System.out.print("Quantos testes quer calcular a Média Ponderada: ");
		int n = leitura.nextInt();
		
		System.out.println();
		double mediaPonderada = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite a 1ª nota do %dº aluno: ", i);
			double n1 = leitura.nextDouble();
			
			System.out.printf("Digite a 2ª nota do %dº aluno: ", i);
			double n2 = leitura.nextDouble();
			
			System.out.printf("Digite a 3ª nota do %dº aluno: ", i);
			double n3 = leitura.nextDouble();
			
			mediaPonderada = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("\nMédia ponderada do %dº aluno = %.1f \n", i, mediaPonderada);
			System.out.println();
		}
		
		leitura.close();
	}
}
