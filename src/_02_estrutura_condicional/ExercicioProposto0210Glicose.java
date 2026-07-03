/*
 * Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela 
 * a classificação desta glicose de acordo com a tabela de referência ao lado. 
 * 						-------------------------------------------
 * 						Classificação	Glicose
 * 						-------------------------------------------
 * 						Normal			Até 100 mg/dl		
 * 						Elevado			Maior que 100 até 140 mg/dl
 * 						Diabetes 		Maior de 140 mg/dl
 * 						-------------------------------------------
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0210Glicose {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite a medida da glicose: ");
		double glicose = leitura.nextDouble();
		
		System.out.print("\nClassificação: ");
		if (glicose < 100) {
			System.out.println("Normal");
		} else if (glicose > 100 && glicose <= 140) {
			System.out.println("Elevado");
		} else {
			System.out.println("Diabetes");
		}
		
		leitura.close();
	}
}
