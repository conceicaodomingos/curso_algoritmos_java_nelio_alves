/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida,
 *  calcule e mostre:  
 *  a) a área do triângulo retângulo que tem A por base e C por altura.
 *  b) a área do círculo de raio C. (pi = 3.14159)
 *  c) a área do trapézio que tem A e B por bases e C por altura.
 *  d) a área do quadrado que tem lado B.
 *  e) a área do retângulo que tem lados A e B. 
 */

package _01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0111Medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		double b = scanner.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		double c = scanner.nextDouble();
		
		double areaTriangulo = (a * c)/2;
		System.out.println(
			String.format("\nÁrea do Triângulo Retângulo de Base A e Altura C = %.3f", areaTriangulo));
		
		double areaCirculo = Math.PI * Math.pow(c, 2);
		System.out.println(String.format("Área do Círculo de Raio C = %.3f", areaCirculo));
		
		double areaTrapezio = ((a + b) * c) / 2;
		System.out.println(
			String.format("Área do Triângulo Retângulo de Base A e Altura C = %.3f", areaTrapezio));
		
		double areaQuadrado = Math.pow(b, 2);
		System.out.println(String.format("Área do Quadrado de Lado B = %.3f", areaQuadrado));
		
		double areaRetangulo = a * b;
		System.out.println(String.format("Área do Retângulo de Lados A e C = %.3f", areaRetangulo));
		
		scanner.close();
	}
}
