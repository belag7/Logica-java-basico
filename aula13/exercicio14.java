package exercicios;

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
     try (var scanner = new Scanner(System.in)) {
    System.out.print("Digite o peso dos peixes: "); 
            double peso = scanner.nextDouble();

            double excesso = 0;
            double multa = 0;

            if (peso > 50) { 
                excesso = peso - 50;
                multa = excesso * 4;
            }

        System.out.println("excesso: " + excesso);
        System.out.println("Multa: R$ " + multa);

}
}
}


//14.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve  pagar uma multa de R$ 4,00 por quilo excedente. João precisa quevocê faça um programa que leia a variável peso (peso de peixes) e
//verifique se há excesso. Se houver, gravar na variável excesso e na
//variável multa o valor da multa que João deverá pagar. Caso contrário
//mostrar tais variáveis com o conteúdo ZERO.
