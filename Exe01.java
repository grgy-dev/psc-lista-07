import java.util.Scanner;
import java.util.ArrayList;

public class Exe01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<Double>();
        double temp = 0.0, soma =0.0, media=0.0;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temp = scanner.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        media = soma / 12;
        System.out.printf("A média anual de temperaturas é: %.2f\n", media);
        System.out.println("Meses com temperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.printf("%d - %s: %.2f\n", (i+1),meses[i], temperaturas.get(i));
            }
        }

        scanner.close();
    }
}
