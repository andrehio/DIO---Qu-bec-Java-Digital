/*
 * Robô
 * 
 * Em um jogo 2D existe um robô de limpeza que começa na posição (0,0). 
 * Ele recebe alguns comandos através de uma sequência de movimentos. 
 * Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo), 
 * "D"(movimento para direita) e "A"(movimento para esquerda). Você deverá verificar
 *  se após completar seus movimentos o robô se encontra na posição (0,0). 
 *  Retorne true se o robô retornar à origem ou false caso contrário. 
 *  Assuma que a magnitude do movimento do robô é a mesma para cada movimento.
 */

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String movimentos = leitor.nextLine();
		var y = 0;
		var x = 0;
		
		for (int i = 0; i < movimentos.length(); i++) {
			char ch = movimentos.charAt(i);
			switch (ch) {
			case 'W':
				x++;
				break;
			case 'S':
				x--;
				break;
			case 'D':
				y++;
				break;
			case 'A':
				y--;
				break;
			}
		}
		System.out.println((x == 0 && y == 0) ? "true":"false");
		leitor.close();
	}
}
