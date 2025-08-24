package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		consultaDados();
	}

	public static void consultaDados() {

		Integer numero;
		String agencia;
		String nomeCliente;
		Float saldo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da Agência!");
		numero = sc.nextInt();
		System.out.println("Por favor, digite o nome da Agência!");
		agencia = sc.next();
		System.out.println("Agora digite o nome do cliente: ");
		nomeCliente = sc.next();
		System.out.println("Informe o saldo:");
		saldo = sc.nextFloat();

		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco," + " sua agência é "
				+ agencia + " conta " + numero.toString() + " e seu saldo R$:" + saldo.toString()
				+ "  já está disponível para saque");

	}

}
