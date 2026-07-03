/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem
 * ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa 
 * mais velha. 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0409MaisVelho {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantas pessoas vai digitar? ");
		int n = leitura.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		int idadePessoaMaisVelha = 0;
		String nomePessoaMaisVelha = "";
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nDados da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			leitura.nextLine();
			nome[i] = leitura.nextLine();
			System.out.print("Idade: ");
			idade[i] = leitura.nextInt();
			
			if (idade[i] > idadePessoaMaisVelha) {
				idadePessoaMaisVelha = idade[i];
				nomePessoaMaisVelha = nome[i];
			}
		}
		
		System.out.println("\nPESSOA MAIS VELHA: "+nomePessoaMaisVelha);
		leitura.close();
	}
}
