/*
 * Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de 
 * combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo 
 * médio do carro, com três casas decimais.
 */

package _01_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProposto0110Consumo {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		double distancia = leitura.nextDouble();
		
		System.out.print("Combustível gasto: ");
		double combustivel = leitura.nextDouble();
		
		double consumo = distancia / combustivel;
		System.out.printf("\nConsumo médio = %.3f", consumo);
		
		leitura.close();
	}

}
