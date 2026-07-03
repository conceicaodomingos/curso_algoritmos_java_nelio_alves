/*
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
 * organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
 * quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. 
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
 * informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia 
 * utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um 
 * valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um 
 * inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando 
 * o tipo de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada 
 * tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, 
 * sendo que o percentual deve ser apresentado com dois dígitos após o ponto. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0314Experiencias {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos casos de teste serão digitados? ");
		int n = leitura.nextInt();
		
		System.out.println("Tipos de Cobaias");
		System.out.println("---------------");
		System.out.println("[C] - Coelho");
		System.out.println("[R] - Rato");
		System.out.println("[S] - Sapo");
		System.out.println("---------------");
		
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Quantidade de cobaias: ");
			int qtd = leitura.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			leitura.nextLine();
			char tipo = leitura.next().charAt(0);
			
			switch (tipo) {
				case 'c', 'C' -> totalCoelhos += qtd;
				case 'r', 'R' -> totalRatos += qtd;
				case 's', 'S' -> totalSapos += qtd;
				default -> System.out.println("Caso inválido!");
			}
		}
		
		int totalCobaias = totalCoelhos + totalRatos + totalSapos;
		
		double percentualCoelhos = (double) totalCoelhos / totalCobaias * 100.0;
		double percentualRatos = (double) totalRatos / totalCobaias * 100.0;
		double percentualSapos = (double) totalSapos / totalCobaias * 100.0;
		
		System.out.println("\nRELATÓRIO FINAL");
		System.out.println("Total de cobaias: "+totalCobaias);
		System.out.println("Total de coelhos: "+totalCoelhos);
		System.out.println("Total de ratos: "+totalRatos);
		System.out.println("Total de sapos: "+totalSapos);
		
		System.out.println(String.format("Percentual de coelhos: %.2f", percentualCoelhos));
		System.out.println(String.format("Percentual de ratos: %.2f", percentualRatos));
		System.out.println(String.format("Percentual de sapos: %.2f", percentualSapos));
						
		leitura.close();
	}
}
