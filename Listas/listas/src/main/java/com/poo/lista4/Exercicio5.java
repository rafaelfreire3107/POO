package com.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*5) Escreva um programa que sirva como uma lista de compras de
mercado. Você irá criar um menu que pergunte se o usuário quer inserir
um item ou ver a lista.*/

public class Exercicio5 {
    public static void resolucao() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int opcao;
        ArrayList<String> lista = new ArrayList<>();

        do {

            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1: 
                    System.out.println("Insira o item desejado: ");
                    String item = sc.nextLine();
                    lista.add(item);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Item adicionado com sucesso!");
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 2:
                if (lista.isEmpty()){
                    System.out.println("Lista vazia");
                    TimeUnit.SECONDS.sleep(3);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                }else{
                    System.out.println("-------Lista-------");
                }
                for(String i : lista)
                System.out.println("-" + i);
                break;
                default:
                System.out.println("Programa Encerrado");
                System.exit(0);
                break;
                
            }

        }while (opcao != 3);
    }
}

