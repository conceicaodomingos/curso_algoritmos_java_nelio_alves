/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o 
 * vetor C gerado. 
 */

package _04_vetores;

import java.util.Scanner;

public class ExercicioProposto0406SomaVetores {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = leitura.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("\nDigite os valores do vetor A");
		for (int i = 0; i < a.length; i++) {
			System.out.print((i+1)+"º valor do vetor A: ");
			a[i] = leitura.nextInt();
		}
		
		System.out.println("\nDigite os valores do vetor B");
		for (int i = 0; i < b.length; i++) {
			System.out.print((i+1)+"º valor do vetor B: ");
			b[i] = leitura.nextInt();
		}
		
		System.out.println("\nVETOR RESULTANTE:");
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != (a.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("] + [");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i != (b.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("] = [");
		
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			System.out.print(c[i]);
			if (i != (n - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		leitura.close();
	}
}
