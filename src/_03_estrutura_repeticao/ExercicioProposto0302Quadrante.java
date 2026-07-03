/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no 
 * sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será 
 * encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem 
 * alguma). 
 */

package _03_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioProposto0302Quadrante {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a coordenada X: ");
		double x = leitura.nextDouble();

		System.out.print("Digite a coordenada Y: ");
		double y = leitura.nextDouble();

		while (x != 0 && y != 0) {
			System.out.println();
			if (x > 0 && y > 0) {
				System.out.print("P(" + x + ", " + y + ") pertence ao Iº Quadrante");
			} else if (x < 0 && y > 0) {
				System.out.print("P(" + x + ", " + y + ") pertence ao IIº Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.print("P(" + x + ", " + y + ") pertence ao IIIº Quadrante");
			} else if (x > 0 && y < 0) {
				System.out.print("P(" + x + ", " + y + ") pertence ao IVº Quadrante");
			}

			System.out.println("\n");
			System.out.print("Digite a coordenada X: ");
			x = leitura.nextDouble();

			System.out.print("Digite a coordenada Y: ");
			y = leitura.nextDouble();
		}

		System.out.print("\nPelo menos uma das cordenadas digitadas foi nula."
				+ "\nO programa terminou!");
		leitura.close();
	}
}
