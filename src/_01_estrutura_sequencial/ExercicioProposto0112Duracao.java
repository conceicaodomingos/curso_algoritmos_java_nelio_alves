/*
 * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
 * formato horas:minutos:segundos. 
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0112Duracao {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a duração em segundos: ");
		int duracao = leitura.nextInt();
		
		int horas = duracao / 3600;
		int resto = duracao % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.println(horas+":"+minutos+":"+segundos);
		
		leitura.close();
	}
}
