/*
 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
 * nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0108Idades {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nome1 = leitura.nextLine();
		System.out.print("Idade: ");
		int idade1 = leitura.nextInt();
		
		System.out.println("\nDados da segunda pessoa:");
		System.out.print("Nome: ");
		leitura.nextLine();
		String nome2 = leitura.nextLine();
		System.out.print("Idade: ");
		int idade2 = leitura.nextInt();
		
		double idadeMedia = (double) (idade1 + idade2) / 2;
		System.out.println("\nA idade média de "+nome1+" e "+nome2+" é "+idadeMedia);
		
		leitura.close();
	}

}
