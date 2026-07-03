/*
 * Faça um programa para ler um número ideterminado de dados, contendo cada um, a idade de um 
 * indivíduo. O último dado, que não entrará nos cálculos, contem um valor de idade negativa. Calcular
 * e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira
 * vez, mostrar a mensagem: impossível calcular.
 */

package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido0302MediaIdades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a idade [nº negativo para encerrar]: ");
		int idade = leitura.nextInt();
		
		int soma = 0;
		int contador = 0;
		
		while (idade >= 0) {
			soma += idade;
			contador++;
			System.out.print("Digite a idade [nº negativo para encerrar]: ");
			idade = leitura.nextInt();
		}
		
		if (contador == 0) {
			System.out.println("\nIdade inválida, Impossível calcular!");
		} else {
			double media = (double) soma / contador;
			System.out.printf("\nMedia das idades %.2f", media);
		}
		
		leitura.close();
	}
}
