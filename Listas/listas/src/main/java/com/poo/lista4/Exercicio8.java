package com.poo.lista4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Exercicio8 {
    
     
    public static void resolucao()throws InterruptedException {
        
        ArrayList<String> listaCompras = new ArrayList<>();
        ArrayList<Double> listaPrecos = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 5) {
         
            System.out.println("\n*** LISTA DE COMPRAS ***");
            System.out.println("1. Inserir itens");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Remover item");
            System.out.println("4. Imprimir lista ordenada por preço");
            System.out.println("5. Sair");
            System.out.print("Escolha a opção: ");
            
            opcao = leia.nextInt();
            leia.nextLine();
    
            switch (opcao) {
                case 1:
    
                    System.out.print("\nDigite o nome do item: ");
                    String item = leia.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = leia.nextDouble();
                    leia.nextLine();
                    listaCompras.add(item);
                    listaPrecos.add(preco);
                    System.out.println("\nItem '" + item + "' adicionado à lista.");
                    break;
    
                case 2:
    
                    System.out.println("\nLista de Compras:");
                    
                    if (listaCompras.isEmpty()) {
    
                        System.out.println("\nA lista está vazia.\n");
      
                    } else {
                        for (int i = 0; i < listaCompras.size(); i++) {
      
                            System.out.println((i + 1) + ". " + listaCompras.get(i) + " R$ " + String.format("%.2f", listaPrecos.get(i)));
                        }
                    }
                    break;
                
                case 3:
                
                if (listaCompras.isEmpty()) {
                        System.out.println("\nA lista está vazia. Não há o que remover.");
                    } else {
                        System.out.println("\nDigite o número do item para removê-lo:");
                
                        for (int i = 0; i < listaCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaCompras.get(i));
                        }
                
                        int itemRemover = leia.nextInt();
                
                        leia.nextLine();
                        if (itemRemover > 0 && itemRemover <= listaCompras.size()) {
                            listaCompras.remove(itemRemover - 1);
                            listaPrecos.remove(itemRemover - 1);
                            System.out.println("Item removido da lista.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                
                case 4:
                    if (listaCompras.isEmpty()) {
                        System.out.println("\nA lista está vazia.\n");
                    } else {
                        ArrayList<Integer> indicesOrdenados = new ArrayList<>();
                        for (int i = 0; i < listaPrecos.size(); i++) {
                            indicesOrdenados.add(i);
                        }
                        
                        indicesOrdenados.sort(new Comparator<Integer>() {
                            public int compare(Integer i1, Integer i2) {
                                return Double.compare(listaPrecos.get(i1), listaPrecos.get(i2));
                            }
                        });
                        
                        System.out.println("\nLista de Compras Ordenada por Preço:");
                        for (int i : indicesOrdenados) {
                            System.out.println((i + 1) + ". " + listaCompras.get(i) + " R$ " + String.format("%.2f", listaPrecos.get(i)));
                        }
                    }
                    break;
                }
            }
        }
    }