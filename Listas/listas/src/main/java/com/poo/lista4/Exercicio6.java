package com.poo.lista4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio6 {
    public static void resolucao() throws InterruptedException {

        Scanner leia = new Scanner(System.in);
        int opcao;
        ArrayList<String> lista = new ArrayList<>();
        
        
        do {
            
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Remover Item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
        
            switch (opcao) {
                case 1: 
                    System.out.println("Insira o item desejado: ");
                    String item = leia.nextLine();
                    lista.add(item);
                    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Item adicionado com sucesso!");
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista está vazia !");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }else{
                    System.out.println("----------- Lista -----------");
                    for(String i : lista)
                    System.out.println("- " + i);
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                    System.out.println("Não tem item para remover");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }else{
                System.out.println("----------- Lista -----------");
                
                for(int i = 0; i < lista.size(); i++){
                    System.out.println((i+1) + "- " + lista.get(i));
                }
                System.out.println("Escolha o número que quer remover da lista: ");
                int removerItem = leia.nextInt();
                if (removerItem > 0 && removerItem <= lista.size()) {
                    lista.remove(removerItem - 1);
                    System.out.println("Item removido com sucesso !");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    System.out.println("Número invalido, tente novamente!");
                    }
                }
                    break;
                case 4:
                System.out.println("Programa Encerrado !");
                System.exit(0);
                    break;
                default:
                System.out.println("Número invalido, tente novamente!");
                    break;
            }
        } while (opcao != 4);
    }
}