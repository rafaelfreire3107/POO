package com.poo.lista2;
import java.util.Scanner;
public class Exercicio1 {
public static void resolucao2(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double numero = sc.nextDouble();

    if(numero%2==0){
        System.out.println("Número par");
    }
    else{
        System.out.println("Número ímpar");
    }


    sc.close();
}

}
