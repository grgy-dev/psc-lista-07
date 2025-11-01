import java.util.Scanner;
import java.util.ArrayList;

public class Exe03 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<Double>();
        double nota, soma =0.0, media=0.0;
        int contador = 0, acimaMedia =0, abaixo7=0;

        do {
            System.out.print("Digite uma nota (ou -1 para sair): ");
            nota = scanner.nextDouble();
            if (nota < 0) {
                contador++;
                break;
            } else if (nota > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                continue;
            } else {
                soma += nota;
                if (nota < 7) {
                    abaixo7++;
                }
            }
            notas.add(nota);
        } while (true);

        System.out.println("Notas digitadas (ordem digitada):");

        for (Double n : notas) {
            System.out.printf("%.2f ", n);
        }

        System.out.println("\nNotas digitadas (ordem inversa):");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.printf("%.2f ", notas.get(i));
        }

        System.out.printf("Soma das notas: %.2f\n", soma);

        media = soma / notas.size();

        System.out.printf("Média das notas: %.2f\n", media);
        for (Double n : notas) {
            if (n > media) {
                acimaMedia++;
            }
        }

        System.out.printf("Quantidade de notas acima da média: %d\n", acimaMedia);
        System.out.printf("Quantidade de notas abaixo de 7: %d\n", abaixo7);
        System.out.println("\nPrograma encerrado. \nObrigado por utilizar nosso sistema!\nBeba Agua");
        


        scanner.close();
    }
}
