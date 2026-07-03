/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em 
 * seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do 
 * intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do 
 * intervalo, e "out" para fora do intervalo). 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0305Intervalo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Quantos valores deseja digitar? ");
		int n = leitura.nextInt();
		
		System.out.println();
		int contaDentro = 0;
		int contaFora = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite o %dº número: ", i);
			int x = leitura.nextInt();
			
			if (x >= 10 && x <= 20) {
				contaDentro++;
			} else {
				contaFora++;
			}
		}
		
		System.out.println();
		System.out.println("Números dentro do intervalo [10, 20]: "+contaDentro);
		System.out.println("Números fora do intervalo [10, 20]: "+contaFora);
		
		leitura.close();
	}
}
