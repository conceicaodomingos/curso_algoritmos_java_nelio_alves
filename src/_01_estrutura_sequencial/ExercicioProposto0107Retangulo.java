/*
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
 * da área, perímetro e diagonal deste retângulo, com quatro casas decimais
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0107Retangulo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Base do retângulo: ");
		double base = leitura.nextDouble();
		
		System.out.print("Altura do retângulo: ");
		double altura = leitura.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("\nÁREA = %.4f", area);
		System.out.printf("\nPERÍMETRO = %.4f", perimetro);
		System.out.printf("\nDIAGONAL = %.4f", diagonal);
		
		leitura.close();
	}

}
