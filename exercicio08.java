package exercicios.aula13;

import java.util.Scanner;


public class exercicio08 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Quanto você ganha por hora: ");
			double horas = scanner.nextDouble();
			
		    System.out.print("Numero de horas trabalhadas no mês: ");
			double mes = scanner.nextDouble();
			
			double salario = horas * mes;
			
 			System.out.print("Total do salário no referido mês: " + salario); 

			
//08.  Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês
			
		}
	}
}


