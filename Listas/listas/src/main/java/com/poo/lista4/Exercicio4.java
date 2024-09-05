package com.poo.lista4;

public class Exercicio4 {
public static void resolucao(){
    
    int lista[] = {3, 5, 6, 7, 8, 10, 22, 55, 110};
    int contaPares = 0;
    for (int i = 0; i < 9 ; i++){
        if (lista[i] % 2 == 0){
            lista[i] += contaPares;
            contaPares++;
        }
    }
        System.out.println("Números pares no vetor = " +contaPares);
}

}
