package com.poo.lista4;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Número de vendas do dia");
    int numeroVendas = sc.nextInt();

    double vendas[] = new double [numeroVendas];
    double totalVendas = 0;

    for (int i = 0; i < numeroVendas; i++) {
        System.out.println("Valor da venda: " + (i+1) + "");
        vendas[i] = sc.nextDouble();
    }
    for (double venda : vendas){
        totalVendas += venda;
    }
    System.out.println("Total vendas do dia: R$" + totalVendas);

    sc.close();


}

}
