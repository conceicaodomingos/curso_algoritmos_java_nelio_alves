/*
 * Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para 
 * isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser 
 * informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com 
 * duas casas decimais. Fórmula: C = (5/9)(F - 32)
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0212Temperatura {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Em qual escala vai digitar a temperatura? ");
		char escala = leitura.next().charAt(0);
		
		switch (escala) {
			case 'f', 'F' -> {
				System.out.print("Digite a temperatura em Fahrenheit: ");
				double f = leitura.nextDouble();
				double c = (5 / 9.0) * (f - 32);
				System.out.println(String.format("\nTemperatura equivalente em Celsius = %.2f", c));
			}
			
			case 'c', 'C' -> {
				System.out.print("Digite a temperatura em Celsius: ");
				double c = leitura.nextDouble();
				double f = 1.8 * c + 32;
				System.out.println(String.format("\nTemperatura equivalente em Fahrenheit = %.2f", f));
			}
		
			default -> System.out.println("\nEscala digitada inválida!");
		}
		
		leitura.close();
	}

}
