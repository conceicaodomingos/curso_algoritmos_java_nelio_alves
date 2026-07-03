/*
 * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
 * Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual 
 * foi a maior. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0211Dardo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a 1ª distância: ");
		double d1 = leitura.nextDouble();
		
		System.out.print("Digite a 2ª distância: ");
		double d2 = leitura.nextDouble();
		
		System.out.print("Digite a 3ª distância: ");
		double d3 = leitura.nextDouble();
		
		System.out.print("\nMAIOR DISTÂNCIA: ");
		if (d1 > d2 && d1 > d3) {
			System.out.println(String.format("%.2f", d1));
		} else if (d2 > d3) {
			System.out.println(String.format("%.2f", d2));
		} else {
			System.out.println(String.format("%.2f", d3));
		}
		
		leitura.close();
	}

}
