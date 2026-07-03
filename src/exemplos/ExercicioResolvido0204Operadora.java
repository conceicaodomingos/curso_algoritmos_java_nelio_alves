/*
 *  Uma operadora de telefonia cobra $ 5.00 por um plano básico que dá direito a 100 minutos de 
 *  telefone. Cada minuto que exceder a franquia de 100 minutos custa $ 0.20. Fazer um programa para 
 *  ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 */

package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido0204Operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantos minutos a pessoa consumiu? ");
		int minuto = teclado.nextInt();
		
		double valorPagar = 50.00;
		
		if (minuto > 100) {
			valorPagar += 2.00 * (minuto - 100);
		}
		
		System.out.printf("\nValor a pagar: $ %.2f ", valorPagar);
		teclado.close();
	}

}
