import java.util.Scanner;
import java.util.ArrayList;

public class Exe02 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        ArrayList<Boolean> respostas = new ArrayList<>();
        String resposta;
        int contador = 0;

        System.out.println("Responda as seguintes perguntas com 'S' ou 'N' para não:");

        do {
            System.out.print("Telefonou para a vítima? ");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostas.add(true);
            } else if (resposta.equals("n")) {
                respostas.add(false);
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'S' ou 'N'.");
                continue;
            }
        } while ((!resposta.equals("s")) && (!resposta.equals("n")));

        do {
            System.out.print("Esteve no local do crime? ");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostas.add(true);
            } else if (resposta.equals("n")) {
                respostas.add(false);
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'S' ou 'N'.");
                continue;
            }
        } while ((!resposta.equals("s")) && (!resposta.equals("n")));

        do {
            System.out.print("Mora perto da vitima? ");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostas.add(true);
            } else if (resposta.equals("n")) {
                respostas.add(false);
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'S' ou 'N'.");
                continue;
            }
       } while ((!resposta.equals("s")) && (!resposta.equals("n")));

        do {
            System.out.print("Devia para a vítima? ");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostas.add(true);
            } else if (resposta.equals("n")) {
                respostas.add(false);
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'S' ou 'N'.");
                continue;
            }
        } while ((!resposta.equals("s")) && (!resposta.equals("n")));

        do {
            System.out.print("Já trabalhou com a vítima? ");
            resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                respostas.add(true);
            } else if (resposta.equals("n")) {
                respostas.add(false);
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'S' ou 'N'.");
                continue;
            }
        } while ((!resposta.equals("s")) && (!resposta.equals("n")));

        for (Boolean resp : respostas) {
            if (resp) {
                contador++;
            }
        }

        if (contador == 5) {
            System.out.println("\nClassificação: Assassino");
        } else if (contador >= 3) {
            System.out.println("\nClassificação: Cúmplice");
        } else if (contador == 2) {
            System.out.println("\nClassificação: Suspeito");
        } else {
            System.out.println("\nClassificação: Inocente");
        }


        scanner.close();
    }
}
