import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nomeCliente = entrada.nextLine();
		
		System.out.println("Digite a agencia:");
		agencia = entrada.nextLine();
		
		
		System.out.println("Digite o numero da conta:");
		numero = entrada.nextInt();
		
		System.out.println("Digite o seu saldo:");
		saldo = entrada.nextDouble();
		
		System.out.println("\nOlá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+
				", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

	}

}
