package exercicios.aula13;

import java.util.Scanner;


public class exercico12 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Digite sua altura para saber seu peso ideal ");
			double altura = scanner.nextDouble(); 
			
			double pesoideal = (72.7*altura) - 58;
			System.out.printf("Seu peso ideal é: " + pesoideal);
			
			
	//12.Tendo como dados de entrada a altura de uma pessoa, construa um
			//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
				//(72.7*altura) - 58

}

}
}
