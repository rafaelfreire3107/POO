package com.poo.lista1;
import java.util.Scanner;
public class Exercicio4 {
    public static void resolucao() {
    
        int numero1;

        System.out.println("Digite um numero: ");
        Scanner leia = new Scanner(System.in);
        numero1 = leia.nextInt();

        System.out.println("O antecessor é " + (numero1 - 1));
        System.out.println("O sucessor é: " + (numero1 + 1));
    }
}


