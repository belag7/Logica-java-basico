package exercicios.aula13;

import java.util.Scanner;

public class exercicio05 {
	
	public static void main(String[] args) {
    	
         try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite o valor em metros: ");
			double metros = scanner.nextDouble();
			
			double centimetros = metros * 100; 
			
			System.out.print("O valor do metro em centimetros é " + centimetros);
			
			
			//5. Faça um Programa que converta metros para centímetros.

			
         }
         
         
	}
         
         
     
}