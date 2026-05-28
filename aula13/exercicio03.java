package exercicios.aula13;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
    	
         try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble(); 
			
			double resultado = numero1 + numero2; 
			
			System.out.print("O resultado da soma soma é: " + resultado);
		 } 
    	
         //Faça um Programa que peça dois números e imprima a soma

    	
		}

  
}