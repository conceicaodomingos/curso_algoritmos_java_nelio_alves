/*
 * Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de 
 * quanto cada pessoa ganha, conforme tabela ao lado. Fazer um programa para ler o salário de uma 
 * pessoa, daí mostrar qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual
 *  foi a porcentagem de aumento.
 *  					-------------------------------------------
 * 						Salário atual				Aumento
 * 						-------------------------------------------
 * 						Até $1000					20%		
 * 						Acima de $1000 até $3000	15%
 * 						Acima de $3000 até $8000	10%
 * 						Acima de $8000				5%
 * 						-------------------------------------------
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0214Aumento {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
	
		System.out.print("Digite o salário da pessoa: ");
		double salario = leitura.nextDouble();
	
		int percentagem;
		if (salario <= 1000.00) {
			percentagem = 20;
		} else if (salario > 1000.00 && salario <= 3000.00 ) {
			percentagem = 15;
		} else if (salario > 3000.00 && salario <= 8000.00 ) {
			percentagem = 10;
		} else {
			percentagem = 5;
		}
		
		double aumento = salario * (percentagem / 100.00);
		double novoSalario = salario + aumento;
		
		System.out.printf("\nNovo salário = $ %.2f\n", novoSalario);
		System.out.printf("Aumento = $ %.2f\n", aumento);
		System.out.printf("Percentagem = %d%%\n", percentagem);
		
		leitura.close();
	}
}
