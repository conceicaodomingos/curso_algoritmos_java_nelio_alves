/*
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a 
 * média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao 
 * intervalo [0,10]). Cada nota deve ser validada separadamente. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0311ValidacaoNota {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = leitura.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Nota inválida! Digite novamente: ");
			nota1 = leitura.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = leitura.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Nota inválida! Digite novamente: ");
			nota2 = leitura.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2.0;
		System.out.printf("\nMÉDIA = %.2f", media);
		
		leitura.close();
	}
}
