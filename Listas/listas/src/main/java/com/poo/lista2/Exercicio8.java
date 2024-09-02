package com.poo.lista2;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Exercicio8 {
    public static void resolucao2() throws InterruptedException{
Scanner sc = new Scanner(System.in);

            int tentativa = 0;
            int pontuacao = 0;
            int erros=0;
            int acertos=0;
            String resposta;


            System.out.println("SEJA BEM VINDO AO JOGO DAS 5 PERGUNTAS!!!");

            String[][] perguntas ={ 
            {"1.Quem pintou a Monalisa?", "a) Van Gogh", "b) Leonardo da Vinci", "c) Picasso", "d) Michelangelo", "b"},
            {"2.Qual o maior planeta do Sistema Solar?", "a)Plutão", "b)Terra", "c)Jupiter", "d)Saturno", "c"},
            {"3.Em que ano o apresentador Silvio Santos morreu?", "a)2012","b)2024","c)2000","d)2021", "b"},
            {"4.Qual é a tradução da palavra BLUE ?", "a)Azul","b)Vermelho", "c)Amarelo", "d)Laranja","a"},
            {"5.Qual foi a primeira capital do Brasil?", "a)Rio de Janeiro", "b)Brasilia", "c)Salvador","d)Belo Horizonte", "c" }};

            for (int i = 0; i < perguntas.length; i++) {
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                System.out.println(perguntas[i][0]); 
                
                System.out.println(perguntas[i][1]); 
                
                System.out.println(perguntas[i][2]);
                
                System.out.println(perguntas[i][3]); 
                
                System.out.println(perguntas[i][4]); 
                
                System.out.print("Digite sua resposta: ");
                resposta = sc.nextLine();

                if(resposta.equalsIgnoreCase(perguntas[i][5])){
                    acertos++;
                    System.out.println("Você acertou!!!");
                    TimeUnit.SECONDS.sleep(3);
                }
                else{
                    erros++;
                    System.out.println("Que pena! Você errou.");
                    TimeUnit.SECONDS.sleep(3);
                }

                if(erros==3){
                    System.out.println("Você errou 3 vezes, GAME OVER.");
                    break;
                }
                

                if(erros<3){
                    System.out.println("Você tem "+acertos+" acertos.");
                }
                
                




            

        
        }
        sc.close();    
    }
}
