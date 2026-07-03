/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste 
 * círculo com quatro casas decimais. 
 */

package _01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0102AreaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println(String.format("\nÁREA DO CÍRCULO = %.4f", area));
		
		sc.close();
	}

}
