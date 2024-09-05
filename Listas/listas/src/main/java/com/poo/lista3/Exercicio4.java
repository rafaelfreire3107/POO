package com.poo.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        
        int numAdivinhacao, palpite;

        System.out.print("\t\t\n JOGO DA ADIVINHAÇÃO \n");

        System.out.println("Escolha um número para adivinhar: ");
        Scanner leia = new Scanner(System.in);
        numAdivinhacao = leia.nextInt();

        do {
            System.out.println("Tente adivinhar o número digitado: ");
            palpite = leia.nextInt();
            
            if (numAdivinhacao == palpite) {
                System.out.println("Você acertou!!");
            
            } else if (palpite == (numAdivinhacao = 1) || palpite == (numAdivinhacao = 1)) {
                System.out.println("Está quente!");
            
            } else {
                System.out.println("Tá frio!");
            }
        }while(palpite != numAdivinhacao);
    }
} 