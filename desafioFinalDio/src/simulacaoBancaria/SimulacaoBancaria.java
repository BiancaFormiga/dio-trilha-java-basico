package simulacaoBancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (true) {
            System.out.println("Escolha uma das opcoes: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f \n", saldo);
                    break;

                case 2:
                    System.out.println("Qual o valor que deseja sacar: ");
                    double saque = scanner.nextDouble();

                    if (saldo >= saque){
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f \n", saldo);
                    } else {
                        System.out.println("Saldo Insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
       
    }
}
