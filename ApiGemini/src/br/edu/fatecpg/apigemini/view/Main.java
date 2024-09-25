package br.edu.fatecpg.apigemini.view;

import java.util.Scanner;
import java.io.IOException;

import static br.edu.fatecpg.apigemini.service.ConsomeApi.fazerPergunta;


public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Pergunte ao Gemini");

        while (true) {

            System.out.println("Você quer - | P - Para Perguntar - | S - Para Sair ");
            String escolha = scan.nextLine();

            if (escolha.equalsIgnoreCase("R")) {

                System.out.println("Informe a sua pergunta");
                String perguntaUsuario = scan.nextLine();
                System.out.println("A resposta para a sua pergunta é: " + respostaGemini);

            } else if (escolha.equalsIgnoreCase("S")) {
                System.out.println("Programa Encerrado");
                break;
            } else {
                System.out.println("Comando invalido");
            }
            // String resposta = fazerPergunta("quem ganha Goku ou Saitama");
            // System.out.println(resposta);
        }

    }

}
