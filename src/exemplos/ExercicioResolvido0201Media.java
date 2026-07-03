/*
 * Fazer um programa para ler as duas duas que um aluno obteve no primeiro e segundo semestres de uma 
 * disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um 
 * texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO". 
 */

package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido0201Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Nota 2: ");
		double nota2 = scanner.nextDouble();
		
		double notaFinal = nota1 + nota2;
		System.out.println(String.format("\nNOTA FINAL = %.1f", notaFinal));
		
		if (notaFinal < 60) {
			System.out.println("REPROVADO");
		}
		
		scanner.close();
	}

}
