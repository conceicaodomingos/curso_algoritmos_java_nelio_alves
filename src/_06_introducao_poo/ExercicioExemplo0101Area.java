/*
 * Fazer um programa para ler as medidas de dois triângulos X e Y (suponha medidas válidas). Em seguida,
 * mostrar o valor das áreas dos dois triângulos e dizer qual dos dois possui área maior.
 * Fórmula para calcular a área de um triângulo dados os lados a, b e c (Fórmula de Heron):
 * A = ((p - a)(p - b)(p - c))^(0.5) onde p = (a + b + c) / 2.
 */

package _06_introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExemplo0101Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Medidas do Triângulo X: ");
		System.out.print("Lado a = ");
		double ax = sc.nextDouble();
		System.out.print("Lado b = ");
		double bx = sc.nextDouble();
		System.out.print("Lado c = ");
		double cx = sc.nextDouble();
		
		System.out.println("\nMedidas do Triângulo Y: ");
		System.out.print("Lado a = ");
		double ay = sc.nextDouble();
		System.out.print("Lado b = ");
		double by = sc.nextDouble();
		System.out.print("Lado c = ");
		double cy = sc.nextDouble();
		
		// Cálculo dos semiperímetros dos triângulos
		double px = (ax + bx + cx) / 2;
		double py = (ay + by + cy) / 2;
		
		// Cálculo das áreas dos triângulos
		double areax = Math.sqrt(px * (px - ax) * (px - bx) * (px - cx));
		double areay = Math.sqrt(py * (py - ay) * (py - by) * (py - cy));
		
		System.out.printf("\nÁrea do Triângulo X = %.4f", areax);
		System.out.printf("\nÁrea do Triângulo Y = %.4f", areay);
		
		String maior = (areax > areay) ? "X" : "Y";
		System.out.println("\n\nMaior área: " + maior);
		
		sc.close();
	}
}
