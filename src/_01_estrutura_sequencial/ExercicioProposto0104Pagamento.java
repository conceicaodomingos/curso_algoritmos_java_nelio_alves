/*
 * Fazer um programa que leia o nome de um funcionário, seu número de horas trabalhadas, o valor que 
 * recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do 
 * funcionário, com duas casas decimais. 
 */

package _01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0104Pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome do Funcionário: ");
		String nome = scanner.nextLine();
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Valor por hora: ");
		double valorHora = scanner.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		System.out.print("\nNOME DO FUNCIONÁRIO = "+nome);
		System.out.print(String.format("\nSALÁRIO = U$ %.2f", salario));
		
		scanner.close();
	}

}
