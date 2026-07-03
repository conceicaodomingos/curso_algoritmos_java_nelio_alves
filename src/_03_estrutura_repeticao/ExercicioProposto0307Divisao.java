/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do 
 * primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0307Divisao {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Quantos pares de números vai dividir? ");
		int contador = leitura.nextInt();
		
		for (int i = 1; i <= contador; i++) {
			System.out.printf("\nDigite o %dº numerador: ", i);
			int numerador = leitura.nextInt();
			
			System.out.printf("Digite o %dº denominador: ", i);
			int denominador = leitura.nextInt();
			
			double divisao = (double) numerador / denominador;
			System.out.printf("\n%dª divisão = ", i);
			
			if (denominador == 0) {
				System.out.println("Impossível dividir");
			} else {
				System.out.println(divisao);
			}
		}
		leitura.close();
	}
}
