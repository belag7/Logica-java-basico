package exercicios.aula13;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite seu sexo (M/F):");
			char sexo = scanner.next().charAt(0); 
			
			System.out.print("Digite sua altura: "); 
			double altura = scanner.nextDouble();
			
			if (sexo == 'M' || sexo == 'm') {
				double pesoIdeal = (72.7 * altura) - 58;
				System.out.print("Seu peso ideal é: " + pesoIdeal);
				
			} else if (sexo == 'F' || sexo == 'f') {
				double pesoIdeal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso ideal é: " + pesoIdeal);
			}else {
				System.out.println("Opção inválida!");
			} 
			
			scanner.close();
			}
	}


	//Tendo como dados de entrada a altura e o sexo de uma pessoa,construa um algoritmo que calcule seu peso ideal, utilizando asseguintes fórmulas:. Para homens: (72.7*h) - 58
// a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b.Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
}
