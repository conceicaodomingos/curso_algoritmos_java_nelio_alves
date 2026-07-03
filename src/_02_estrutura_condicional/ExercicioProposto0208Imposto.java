/*
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
 * pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em 
 * benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, 
 * calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * 						------------------------------------------------
 * 						Renda							Imposto de Renda
 * 						------------------------------------------------
 * 						De R$ 0.00 a R$ 2000.00				Isento		
 * 						De R$ 2000.01 a R$ 3000.00 			  8%
 * 						De R$ 3000.01 a R$ 4500.00 			  18%
 * 						Acima de R$ 4500.00					  28%
 * 						------------------------------------------------
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a 
 * faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.  
 */

package _02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto0208Imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Salário: $ ");
		double salario = leitura.nextDouble();
		
		double imposto = 0;
		System.out.print("\nImposto: ");
		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		if (salario > 2000) {			
			System.out.printf("$ %.2f", imposto);
		}
		
		leitura.close();
	}
}
