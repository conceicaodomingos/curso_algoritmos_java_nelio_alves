package _06_introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExemplo0102Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dados do primeiro funcionário: ");
		System.out.print("Nome: ");
		String nome1 = scanner.next();
		
		System.out.printf("Valor por hora do(a) %s: $ ", nome1);
		double valorHora1 = scanner.nextDouble();
		
		System.out.printf("Horas trabalhadas pelo(a) %s: ", nome1);
		int horas1 = scanner.nextInt();
		
		double salario1 = valorHora1 * horas1;
		System.out.printf("Salário do(a) %s: $ %.2f", nome1, salario1);
		
		System.out.println("\n\nDados do segundo funcionário: ");
		System.out.print("Nome: ");
		String nome2 = scanner.next();
		
		System.out.printf("Valor por hora do(a) %s: $ ", nome2);
		double valorHora2 = scanner.nextDouble();
		
		System.out.printf("Horas trabalhadas pelo(a) %s: ", nome2);
		int horas2 = scanner.nextInt();
		
		double salario2 = valorHora2 * horas2;
		System.out.printf("Salário do(a) %s: $ %.2f", nome2, salario2);
		
		double total = salario1 + salario2;
		System.out.printf("\n\nSalário Total: $ %.2f", total);
		
		scanner.close();
	}

}
