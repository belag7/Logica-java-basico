package exercicios.aula13;

import java.util.Scanner;


public class exercicio18 {
    public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do arquivo em MB: ");
            double MB = scanner.nextDouble();
            System.out.print("Digite a velocidade do link em Mbps: ");
            double Mbps = scanner.nextDouble();

            double tamanhoemMegabits = MB * 8;
            double tempoEmSegundos = tamanhoemMegabits / Mbps;
            double tempoMinutos = tempoEmSegundos / 60; 

            System.out.print("O tempo aproximado de dowload é de " + tempoMinutos + "minutos.");


        }
}
}