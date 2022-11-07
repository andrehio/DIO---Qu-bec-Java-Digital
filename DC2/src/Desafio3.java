import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * Contando números pares
 * 
 * Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual
 * a num cuja soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a
 * soma de todos os seus dígitos.
 */

public class Desafio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int num = leitor.nextInt();
		var count = 0;

		for (int i = 1; i <= num; i++) {
			var strNum = String.valueOf(i);
			if (strNum.length() == 1) {
				if (i % 2 == 0) {
					count++;
				}
				continue;
			}
			char[] vs = strNum.toCharArray();
			var sum = 0;
			for (int j = 0; j < vs.length; j++) {
				sum += (int)Character.getNumericValue(vs[j]);
			}
			if (sum % 2 == 0) {
				count++;
			}

		}
		System.out.println(count);
		leitor.close();
	}
}
