package exercicios.aula13;

import java.util.Scanner;

public class exercicio06 {
	
	public static void main(String[] args) {
    	
         try (var scanner = new Scanner(System.in)) {
 			System.out.print("Digite o valor do raio de um círculo: ");
 			double raio = scanner.nextDouble();
 			
 			double area = Math.PI * raio * raio; 
 			
 			System.out.print("A área do circulo é: " + area); 
 			

         }
        	 
        	
         }
        	 
         }