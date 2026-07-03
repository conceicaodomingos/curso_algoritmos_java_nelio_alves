/*
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, 
 * mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de 
 * venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias 
 * proporcionaram: 
 * - lucro < 10% 
 * - 10% ≤ lucro ≤ 20% 
 * - lucro > 20% 
 * Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o 
 * lucro total. 
 */

package _04_vetores;

import java.util.Scanner;

public class ProblemaProposto0412Comerciante {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = leitura.nextInt();

		String[] nome = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] lucro = new double[n];
		double[] percentagemLucro = new double[n];

		int somaPercentagemLucroAbaixo10 = 0;
		int somaPercentagemLucroAbaixo20 = 0;
		int somaPercentagemLucroAcima20 = 0;
		double valorTotalCompra = 0.0;
		double valorTotalVenda = 0.0;
		double lucroTotal = 0.0;

		for (int i = 0; i < venda.length; i++) {
			System.out.println("\nPRODUTO " + (i + 1));
			System.out.print("Nome: ");
			leitura.nextLine();
			nome[i] = leitura.nextLine();
			System.out.print("Preço de compra: $");
			compra[i] = leitura.nextDouble();
			System.out.print("Preço de venda: $");
			venda[i] = leitura.nextDouble();

			lucro[i] = venda[i] - compra[i];
			percentagemLucro[i] = lucro[i] / compra[i] * 100.0;

			if (percentagemLucro[i] < 10) {
				somaPercentagemLucroAbaixo10++;
			} else if (percentagemLucro[i] < 20) {
				somaPercentagemLucroAbaixo20++;
			} else {
				somaPercentagemLucroAcima20++;
			}

			valorTotalCompra += compra[i];
			valorTotalVenda += venda[i];
			lucroTotal += lucro[i];
		}

		System.out.println("\nRELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + somaPercentagemLucroAbaixo10);
		System.out.println("Lucro entre de 10% e 20%: " + somaPercentagemLucroAbaixo20);
		System.out.println("Lucro acima de 20%: " + somaPercentagemLucroAcima20);
		System.out.println("Valor total de compra: $" + String.format("%.2f", valorTotalCompra));
		System.out.println("Valor total de venda: $" + String.format("%.2f", valorTotalVenda));
		System.out.println("Lucro total: $" + String.format("%.2f", lucroTotal));

		leitura.close();
	}

}
