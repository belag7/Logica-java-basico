package exercicios.aula13;

import java.util.Scanner;

public class exercicio04 {
	
	public static void main(String[] args) {
    	
         try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite a nota de português: ");
			double nota1 = scanner.nextDouble();
			
			System.out.print("Digite a nota de Matemática: ");
			double nota2 = scanner.nextDouble(); 
			
			System.out.print("Digite a nota de História: ");
			double nota3 = scanner.nextDouble();
			
			System.out.print("Digite a nota de Geografia: ");
			double nota4 = scanner.nextDouble(); 
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4; 
			
			System.out.print("A média final é: " + media);
		 } 
    	
    
           //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    	
		}

  
}