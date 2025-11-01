import java.util.Scanner;
import java.util.ArrayList;

public class Exe04 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<Double>();
        double venda = 0.0, salario = 0.0; 
        int sequencia=0; 
        int[] contadores = new int[9];
        String[] faixas = {"$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599", "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 em diante"};

        do{
            sequencia++;
            System.out.print("Digite o valor vendas brutas do vendedor " + (sequencia) + " (-1 para encerrar): R$");
            venda = scanner.nextDouble();
            vendas.add(venda);
        } while (venda != -1);
        for (Double v : vendas) {
            salario = 200 + (v * 0.09);
            if (salario >= 200 && salario < 300) {
                contadores[0]++;
            } else if (salario >= 300 && salario < 400) {
                contadores[1]++;
            } else if (salario >= 400 && salario < 500) {
                contadores[2]++;
            } else if (salario >= 500 && salario < 600) {
                contadores[3]++;
            } else if (salario >= 600 && salario < 700) {
                contadores[4]++;
            } else if (salario >= 700 && salario < 800) {
                contadores[5]++;
            } else if (salario >= 800 && salario < 900) {
                contadores[6]++;
            } else if (salario >= 900 && salario < 1000) {
                contadores[7]++;
            } else {
                contadores[8]++;
            }
        }
        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        for (int i = 0; i < contadores.length; i++) {
            System.out.println(faixas[i] + ": " + contadores[i]);
        }

        
        scanner.close();
    }
}
