/*
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, 
uma estrutura de dados que armazena uma coleção de dados em um bloco de memória. 
Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que 
retorne como resultado apenas os números pares dessa array.
 */

import java.util.*;
import java.util.stream.Collectors;

public class df1_Arrays_Pares {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 3, 5, 7, 11, 13, 18, 34);
		numeros.stream()
			.filter(i -> i % 2 == 0)
		    .collect(Collectors.toList())
		    .forEach(System.out::println);
	}
}
