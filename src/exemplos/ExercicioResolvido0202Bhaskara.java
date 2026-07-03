/*
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
 * Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
 * correspondente "Impossível calcular", caso haja uma divisão por 0 ou raíz de número negativo.
 */

package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido0202Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		double b = scanner.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		double c = scanner.nextDouble();
		
		double d = Math.pow(b, 2) - 4 * a * c;
		double r1 = (- b - Math.sqrt(d)) / (2 * a);
		double r2 = (- b + Math.sqrt(d)) / (2 * a);
		
		if (d < 0) {
			System.out.println("\nImpossível calcular, Delta é negativo!");
			System.out.println("Delta = "+d);
		} else if (a == 0) {
			System.out.println("\nImpossível calcular, não é permitido divisão por zero!");
		} else {
			System.out.println(String.format("\nRAIZ 1 = %.4f", r1));
			System.out.println(String.format("RAIZ 2 = %.4f", r2));		
		}
		
		scanner.close();
	}

}
