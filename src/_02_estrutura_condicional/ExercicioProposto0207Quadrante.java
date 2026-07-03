/*
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em 
 * um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos 
 * eixos cartesianos ou na origem (x = y = 0). 
 * Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. 
 */

package _02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0207Quadrante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		double x = teclado.nextDouble();
		
		System.out.print("Digite a coordenada Y: ");
		double y = teclado.nextDouble();
		
		System.out.println();
		if (x > 0 && y > 0) {
			System.out.print("P("+x+", "+y+") pertence ao Iº Quadrante");
		} else if (x < 0 && y > 0) {
			System.out.print("P("+x+", "+y+") pertence ao IIº Quadrante");
		} else if (x < 0 && y < 0) {
			System.out.print("P("+x+", "+y+") pertence ao IIIº Quadrante");
		} else if (x > 0 && y < 0) {
			System.out.print("P("+x+", "+y+") pertence ao IVº Quadrante");
		} else if (x == 0 && y != 0) {
			System.out.print("P("+x+", "+y+") pertence ao Eixo Y");
		} else if (y == 0 && x != 0) {
			System.out.print("P("+x+", "+y+") pertence ao Eixo X");
		} else if (x == 0 && y == 0) {
			System.out.print("P("+x+", "+y+") está na Origem");
		}
		
		teclado.close();
	}

}
