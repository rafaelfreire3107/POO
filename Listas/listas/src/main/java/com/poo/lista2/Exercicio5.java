package com.poo.lista2;
import java.util.Scanner;
public class Exercicio5 {
    public static void resolucao2(){
        Scanner sc = new Scanner(System.in);
        String login ="rafael123";
        String senha ="123456";
        String verificaLogin;
        String verificaSenha;

        System.out.println("Login: ");
        verificaLogin = sc.nextLine();

        System.out.println("Senha: ");
        verificaSenha = sc.nextLine();

        if(!verificaLogin.equals(login)){
           System.out.println("Login incorreto!");
        }
        else if (!verificaSenha.equals(senha)){
           System.out.println("Senha incorreta!");
        }
        else{
           System.out.println("Bem vindo ao sistema!");
        }
        
   sc.close();    
   }
}
