package com.poo.lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
        System.out.println("==========================================================================");
        System.out.println();

        Scanner leia = new Scanner(System.in);

        String usuario = "rafael123";
        String senha = "123";
        String u = "";
        String s = "";
        int tentativas = 3;

        while(tentativas>=1){
            System.out.print("Digite o Usuário: ");
            u=leia.nextLine();
            System.out.print("Digite a Senha: ");
            s=leia.nextLine();


            if (usuario.equals(u) && senha.equals(s)) { 
                System.out.println("Login efetuado com sucesso");
                leia.close();
                return;
            }
            else if (!usuario.equals(u) && senha.equals(s)) {
                System.out.println("Usuário incorreto");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }

            else if (usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Senha incorreta");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }

            else if (!usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Usuário e Senha incorretos");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            if(tentativas==0){
                System.out.println("\nSEU ACESSO FOI BLOQUEADO");
                leia.close();
                return;
            }
        }
    }
}