package com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {

        double txDolar = 5.25, valorReal, valorDolares;
        
        System.out.print("Digite o valor em reais (R$): ");
        Scanner scanner = new Scanner(System.in);
        valorReal = scanner.nextDouble();

        valorDolares = txDolar/valorReal;
        System.out.printf("O valor de R$" + valorReal + " equivale a US$" + "%.2f", valorDolares);




    }
}