package exercicios.aula13;

import java.util.Scanner;


public class exercicio11 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();   
			
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();
			
			System.out.print("Digite o terceiro número: ");
			double numero3 = scanner.nextDouble();
			
			double resultadoA = (2 * numero1) * (numero2 / 2.0);
			System.out.println("O resultado de A é: " + resultadoA);
			
			double resultadoB = (3 * numero1) + numero3; 
			System.out.println("O resultado de B é: " + resultadoB);
			
			double resultadoC = numero3 * numero3 * numero3; 
			System.out.println("O resultado de C é: " + resultadoC);
			
			
		//Faça um Programa que peça 2 números inteiros e um número real.
			//Calcule e mostre:
				//a. o produto do dobro do primeiro com metade do segundo .
				//b. a soma do triplo do primeiro com o terceiro.
				//c. o terceiro elevado ao cubo.
			
		
}
}
}