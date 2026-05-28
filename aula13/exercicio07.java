package exercicios.aula13;

import java.util.Scanner;

public class exercicio07 {
	
	public static void main(String[] args) {
    	
         try (var scanner = new Scanner(System.in)) {
 			System.out.print("Digite o valor do quadrado para calcular o dobro de sua area: ");
 			double lado = scanner.nextDouble();
 			
 			double area = lado * lado;
 					
 			double resultado = area * 2;
 			
 			System.out.print("O dobro da sua área do quadrado é: " + resultado); 
 			
 			
 			
 			
         }
         }
	}
