package exercicios.aula13;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho da área a ser pintada (m2): ");
            double area = scanner.nextDouble();

            double areaComFolga = area * 1.10;
            double litrosNecessarios = areaComFolga / 6;

            double latas = Math.ceil(litrosNecessarios / 18); 
            double precoLatas = latas * 80;

            double galoes = Math.ceil(litrosNecessarios / 3.6);  
            double precoGaloes = galoes * 25;
            
            double latasMistura = Math.floor(litrosNecessarios / 18);
            double litrosRestantes = litrosNecessarios - (latasMistura * 18);
            double galoesMistura = Math.ceil(litrosRestantes / 3.6);
            double precoMistura = (latasMistura * 80) + (galoesMistura * 25);

            System.out.println("Opção 1 (apenas latas): " + " latas custando R$ " + precoLatas);
            System.out.println("Opção 2 (apenas galões): " + galoes + "galões custando R$ " + precoGaloes);
            System.out.println("Opção 3 (mistura): " + latasMistura + "latas e " + galoesMistura + "galões custando R$ " + precoMistura);

}
 }
}

//Faça um Programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
//galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas
//e os respectivos preços em 3 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;
//o misturar latas e galões, de forma que o preço seja o
//menor. Acrescente 10% de folga e sempre arredonde os
//valores para cima, isto é, considere latas cheias.