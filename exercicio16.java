package exercicios.aula13;

import java.util.Scanner;

public class exercicio16 {
     public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho da área a ser pintada (m2): ");
            double area = scanner.nextDouble();

            double litrosNecessarios = area / 3;
            double latas = Math.ceil(litrosNecessarios / 18 );
            double precoTotal = latas * 80;

            System.out.print("Quantidade de latas: " + latas);
            System.out.print("Preço total: R$ " + precoTotal);


        }
}
}



//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//usuário a quantidades de latas de tinta a serem compradas e o preço total.