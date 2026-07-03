/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o 
 * valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
 */

package _02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0206Intervalo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		double n = teclado.nextDouble();
		
		System.out.println();
		if (n >= 0 && n <= 25) {
			System.out.print(n+" pertence ao Intervalo [0, 25]");
		} else if(n > 25 && n <= 50) {
			System.out.print(n+" pertence ao Intervalo (25, 50]");
		} else if (n > 50 && n <= 75) {
			System.out.print(n+" pertence ao Intervalo (50, 75]");
		} else if (n > 75 && n <= 100) {
			System.out.print(n+" pertence ao Intervalo (75, 100]");
		} else {
			System.out.print(n+" está fora do Intervalo.");
		}
		
		teclado.close();
	}

}
