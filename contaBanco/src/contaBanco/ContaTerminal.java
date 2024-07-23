package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o numero da sua conta: ");
	int numero = Integer.parseInt(sc.nextLine());
	System.out.println("Digite o código da sua agência: ");
	String agencia = sc.nextLine();
	System.out.println("Digite o nome do cliente: ");
	String nome = sc.nextLine();
	System.out.println("Digite o saldo disponível: ");
	double saldo = Double.parseDouble(sc.nextLine());
	
	System.out.println("***--------------***");
	System.out.println(
			" Olá! " + nome +
			", obrigado por criar uma conta em nosso banco, \n sua agência é " + agencia +
			", conta " + numero +
			" e seu saldo R$" + saldo + " já está disponível para saque.");
	
	sc.close();
}
}
