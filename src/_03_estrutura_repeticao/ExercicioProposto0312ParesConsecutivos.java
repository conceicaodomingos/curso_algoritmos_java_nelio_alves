/*
 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X 
 * for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o 
 * valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 
 * 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a 
 * soma de 12+14+16+18+20. 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0312ParesConsecutivos {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Digite um número: ");
			n = leitura.nextInt();
		
			if (n % 2 != 0) {
				n++;
			}
			
			if (n != 0) {
				int s = 5 * (n + 4);
				System.out.println("SOMA = " + s);
			}
			System.out.println();
		} while (n != 0);
		
		
		leitura.close();
	}

}
