/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o 
 * mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
 *  horas. 
 */

package _02_estrutura_condicional;

import java.util.Scanner;

public class ExercicioProposto0204DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Hora inicial do jogo: ");
		int horaInicial = teclado.nextInt();
		
		System.out.print("Hora final do jogo: ");
		int horaFinal = teclado.nextInt();
		
		int duracao;
		
		if (horaInicial >= horaFinal) {
			duracao = (24 + horaFinal) - horaInicial;
		} else {
			duracao = horaFinal - horaInicial;
		}

		System.out.printf("\nO JOGO DUROU %d HORA(S)",duracao);
		teclado.close();
	}
}
