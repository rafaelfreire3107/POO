package com.poo.lista1;
import java.util.Scanner;
public class Exercicio7 {
    public static void resolucao() {
        
        String nome;
        double n1, n2, n3, n4, media;

        System.out.println("Escreva o nome do estudante:");
        Scanner leia = new Scanner (System.in);
        nome = leia.nextLine();

        System.out.println("Escreva a primeira nota:");
        n1= leia.nextDouble();
        System.out.println("Escreva a segunda nota:");
        n2= leia.nextDouble();
        System.out.println("Escreva a terceira nota:");
        n3= leia.nextDouble();
        System.out.println("Escreva a quarta nota:");
        n4= leia.nextDouble();

        media=(n1+n2+n3+n4)/4;

        System.out.printf("A media do aluno " + nome + " é: " + "%.2f" , media);

    }
}
