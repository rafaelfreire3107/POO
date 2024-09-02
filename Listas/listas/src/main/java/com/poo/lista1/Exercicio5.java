package com.poo.lista1;
import java.util.Scanner;
public class Exercicio5 {
    public static void resolucao(){
        
        double area;
        double largura;
        double comprimento;
        double preco, precoMetroQuadrado;

        System.out.print("Largura: ");
        Scanner leia = new Scanner(System.in);
        largura = leia.nextDouble();
    
        System.out.print("Comprimento: ");
        comprimento = leia.nextDouble();
    
        area = largura * comprimento;
        System.out.println("Área: " + area);
    
        System.out.print("\nPreço metro quadrado: ");
        precoMetroQuadrado = leia.nextDouble();
    
        preco = area * precoMetroQuadrado;
        System.out.println("Preço: " + preco);
    }

}
