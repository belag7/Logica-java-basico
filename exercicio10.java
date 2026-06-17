package exercicios.aula13;

import java.util.Scanner;

public class exercicio10 {
		public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
		System.out.print("Qual a temperatura em graus Celsius: ");
		double celsius = scanner.nextDouble();
				
		double farenheit = (celsius * 1.8) + 32; 
				
	 	System.out.print("A temperatura em Farenheit é: "+ farenheit ); 
		}
		}
}

	 			