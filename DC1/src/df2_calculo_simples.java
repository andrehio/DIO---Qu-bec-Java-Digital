/*
 * O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1. 
 * O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
 * Após, calcule e mostre o valor a ser pago.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class df2_calculo_simples {

	public static void main(String[] args){
		List<Pedido> pedidos = new ArrayList<Pedido>();
		int codigoPecas;
		int numeroPecas;
		double valorPecas;

		Scanner leitor = new Scanner(System.in);
		
		try {
			for (int i = 0; i < 2; i++) {
				System.out.printf("--- Peça %d ---\n", i + 1);
				System.out.println("Código: ");
				codigoPecas = leitor.nextInt();
				System.out.println("Quantidade: ");
				numeroPecas = leitor.nextInt();
				System.out.println("Valor unitário: ");
				valorPecas = leitor.nextDouble();
				pedidos.add(new Pedido(codigoPecas, numeroPecas, valorPecas));
			}
			
		}
		catch (InputMismatchException e){
			System.out.println("Insira um número!");
		}
		
		leitor.close();
		
		double soma = 0d;
		for (Pedido pedido : pedidos) {
			soma += pedido.getNumeroPecas() * pedido.getValorPecas();
		}
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", soma));  
		

	}

}

class Pedido{
	int codigoPecas;
	int numeroPecas;
	double valorPecas;

	public Pedido(int codigoPecas, int numeroPecas, double valorPecas) {
		this.codigoPecas = codigoPecas;
		this.numeroPecas = numeroPecas;
		this.valorPecas = valorPecas;
	}

	public int getCodigoPecas() {
		return codigoPecas;
	}

	public void setCodigoPecas(int codigoPecas) {
		this.codigoPecas = codigoPecas;
	}

	public int getNumeroPecas() {
		return numeroPecas;
	}

	public void setNumeroPecas(int numeroPecas) {
		this.numeroPecas = numeroPecas;
	}

	public double getValorPecas() {
		return valorPecas;
	}

	public void setValorPecas(double valorPecas) {
		this.valorPecas = valorPecas;
	}

	@Override
	public String toString() {
		return "codigoPecas=" + codigoPecas + ", numeroPecas=" + numeroPecas + ", valorPecas=" + valorPecas;
	}
	
	
}