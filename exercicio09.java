package exercicios.aula13;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Qual a temperatura em Farenheit: ");
			double farenheit = scanner.nextDouble();
			
			double C = (5.0 * (farenheit-32) / 9.0); 
			
 			System.out.print("A temperatura em celsius é: "+ C ); 
//09.Faça um Programa que peça a temperatura em graus Farenheit,transforme e mostre a temperatura em graus Celsius. 
			
		}
	}
}
