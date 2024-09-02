package com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao2(){
        Scanner sc = new Scanner(System.in);
        String condicao, nome;
        int idade;

        System.out.println("Nome: ");
        nome = sc.nextLine();

        System.out.println("Idade: ");
        idade = sc.nextInt();

        if(idade >= 16 && idade <= 18){
           System.out.println("Acesso somente acompanhado pelo responsável.");
        }
        else if(idade > 18){
           System.out.println("Acesso Liberado.");
        }
        else{
           System.out.println("Acesso Negado.");
        }

        sc.close();
   }     

}
