package com.poo.lista4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Exercicio2 {
    public static void resolucao() throws InterruptedException {

    Scanner leia = new Scanner(System.in);

    System.out.println("Número de vendas do dia: ");
    int numeroVendas = leia.nextInt();

    double vendas[] = new double [numeroVendas];
    double totalVendas = 0;
    double valorMaior = 0;
    double valorMenor = 99999;

        for (int i = 0; i < numeroVendas; i++) {
            System.out.println("Digite o valor da venda " + (i + 1) + ":");
            vendas[i] = leia.nextDouble();

            if(vendas[i] > valorMaior && vendas[i] !=0){
                valorMaior = vendas[i];
            }
            if(vendas[i] < valorMenor && vendas[i] !=0){
                valorMenor = vendas[i];
            }
        }
        for (double venda : vendas) {
            totalVendas += venda;
        }
        System.out.println("Total das vendas do dia: R$" + totalVendas);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Maior valor de venda: " + valorMaior);
        System.out.println("Menor valor de venda: " + valorMenor);
    }
}
