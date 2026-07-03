/*
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa
 * decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o 
 * programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
 * duas casas decimais.
 */

package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido0101Terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Largura: ");
		double largura = scanner.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = scanner.nextDouble();
		
		System.out.print("Valor do Metro Quadrado: ");
		double valorMetroQuadrado = scanner.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valorMetroQuadrado;
		
		System.out.printf("\nÁrea do Terreno = %.2f \n", area);
		System.out.printf(String.format("Preço do Terreno = %.2f \n", preco));

		scanner.close();
	}

}
