/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem
 *  como os nomes dessas pessoas caso houver.
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0403Alturas {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = leitura.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		double somaAlturas = 0.0;
		int menores16 = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nDados da "+(i+1)+"ª pessoa:");
			System.out.print("Nome: ");
			nome[i] = leitura.next();
			System.out.print("Idade: ");
			idade[i] = leitura.nextInt();
			System.out.print("Altura: ");
			altura[i] = leitura.nextDouble();
			
			somaAlturas += altura[i];
			
			if (idade[i] < 16) {
				menores16++;
			}
		}
		
		double alturaMedia = somaAlturas / n;
		double percentagemMenores16 = menores16 * 100.0 / n;
		
		System.out.println(String.format("\nAltura Média = %.2f", alturaMedia));
		System.out.println(String.format("Pessoas com menos de 16 anos: %.2f%%", percentagemMenores16));
		System.out.print("Seus nomes são: ");
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		leitura.close();
	}

}
