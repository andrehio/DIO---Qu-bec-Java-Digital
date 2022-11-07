import java.util.Scanner;

/*
 * Reduzindo um número a zero
 * 
 * Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero. Em uma etapa,
 * se o número atual for par, você deve dividi-lo por 2, caso contrário, você deve
 * subtrair 1 dele.
 */

public class Desafio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		var step = 0;
		
		num = Math.abs(num);
		while (num>0) {
			if(num % 2 == 0 && num >= 2) {
				num = num / 2;
			}
			else {
				num -= 1;
			}
			step++;
		}
		System.out.println(step);
		leitor.close();

	}

}
