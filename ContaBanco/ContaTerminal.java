package ContaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Por favor, digite o número da Conta: ");
		numero = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = sc.nextLine();
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = sc.nextLine();
		

		System.out.print("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		
		System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo " +saldo+ " já está disponível para saque.");
		
		sc.close();
	}
	
}
