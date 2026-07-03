/*
 * Fazer um programa que leia três medidas: A, B e C. Em seguida, calcule e mostre:  
 *  a) a área do quadrado que tem lado A.
 *  b) a área do triângulo retângulo que tem A por base e B por altura.
 *  c) a área do trapézio que tem A e B por bases e C por altura.
 */

package _01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0106Areas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		double b = scanner.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		double c = scanner.nextDouble();
		
		double areaQuadrado = Math.pow(a, 2);
		System.out.println(String.format("\nÁrea do Quadrado de Lado A = %.3f", areaQuadrado));
		
		double areaTriangulo = (a * b)/2;
		System.out.println(
			String.format("Área do Triângulo Retângulo de Base A e Altura B = %.3f", areaTriangulo));
		
		double areaTrapezio = ((a + b) * c) / 2;
		System.out.println(
			String.format("Área do Triângulo Retângulo de Base A e Altura C = %.3f", areaTrapezio));
		
		scanner.close();
	}
}
