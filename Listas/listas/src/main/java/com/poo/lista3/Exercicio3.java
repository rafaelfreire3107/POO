package com.poo.lista3;
import java.util.Scanner;
import org.springframework.boot.system.SystemProperties;
/*3) Escreva um código que receba dois números inteiros e escreva todos os
números pares entre eles. */
public class Exercicio3 {
public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número:");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                int num2 = scanner.nextInt();

                int inicio = Math.min(num1, num2);
                int fim = Math.max(num1, num2);

                System.out.println("Números pares entre " + inicio + " e " + fim + ":");

                for (int i = inicio; i <= fim; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }

                scanner.close();
            }
}
