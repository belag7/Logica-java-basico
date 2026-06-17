package exercicios.aula13;

import java.util.Scanner;


public class exercicio15 {
    public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Quanto você ganha por hora: ");
			double ganhoHora = scanner.nextDouble();
			System.out.print("Numero de horas trabalhadas no mês: ");
			double horasTrabalhadas = scanner.nextDouble();
			
			double salarioBruto = ganhoHora * horasTrabalhadas;
            double ir = salarioBruto * 0.11;
            double inss = salarioBruto * 0.08;
            double sindicato = salarioBruto * 0.05;
            double salarioLiquido = salarioBruto - ir - inss - sindicato; 

            System.err.println("Salário Bruto: R$ " + salarioBruto);
            System.out.println("IR (11%): R$ " + ir);
            System.out.println("INSS (8%): R$ " + inss);
            System.out.println("Sindicato (5%): R$ "+ sindicato);
            System.out.println("Salário líquido: R$ " + salarioLiquido);




        }

}
}


//Faça um Programa que pergunte quanto você ganha por hora e onúmero de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato.