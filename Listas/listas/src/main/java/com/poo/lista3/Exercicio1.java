package com.poo.lista3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*1) Escreva um programa que sirva como um cronômetro. O usuário deve
digitar um numero em segundos e o programa deve contabilizar os segundos
digitados. O programa deve receber somente números entre 1 e 59, do
contrário ele retornar um erro e solicitar que o usuário digite um número válido.*/

public class Exercicio1 {
    
    public static void resolucao() throws InterruptedException {
            
        int numeroDigitado;

        System.out.println("Digite um número em segundos ente 1 e 59:");
        Scanner leia = new Scanner(System.in);
        numeroDigitado = leia.nextInt();
        
        
            while (numeroDigitado < 1 || numeroDigitado > 59) {
                System.out.println("Digite um número valido:");
                numeroDigitado = leia.nextInt();
        
    }


    for (int i = 0; i <= numeroDigitado; i++) {
            System.out.println( "00:" + i );
            TimeUnit.SECONDS.sleep(1);
    }
}

}
