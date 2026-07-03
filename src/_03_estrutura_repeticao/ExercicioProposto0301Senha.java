/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de 
 * senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada 
 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere 
 * que a senha correta é o valor 2002. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0301Senha {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
	
		System.out.print("Digite a senha: ");
		int senha = leitura.nextInt();
		
		while(senha != 2002) {
			System.out.println("\nSenha Inválida!");
			System.out.print("Digite a senha: ");
			senha = leitura.nextInt();
		}
		
		System.out.println("\nAcesso permitido. Bem vindo!");

		leitura.close();
	}
}
