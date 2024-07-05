package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		int conta;
		int agencia;
		double saldo;
		String nome;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Bem Vindo ao Banco X");
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = teclado.nextInt();
		
		System.out.println("Digite o número da conta:");
		conta = teclado.nextInt();
		
		System.out.println("Digite seu nome: ");
		nome = teclado.next();
		
		System.out.println("Digite o saldo que irá depositar: ");
		saldo = teclado.nextDouble();
		
		System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência: %d, Conta: %d e seu Saldo de %.2f reais já está disponível para o saque.", agencia, conta, saldo);
		
	}

}
