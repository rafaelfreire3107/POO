package com.poo.lista2;
import java.util.Scanner;
public class Exercicio2 {
    public static void resolucao2(){
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite um numero: ");
        numero1=sc.nextDouble();
        System.out.println("Digite outro numero: ");
        numero2=sc.nextDouble();

        if(numero1 > numero2){
        System.out.println("Número 1 maior que número 2");
        }
        else if(numero1 < numero2){
           System.out.println("Número 1 menor que número 2");
        }
        else{
           System.out.println("Número 1 igual a número 2");
        }
       
       sc.close(); 
   }
}
