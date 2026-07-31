package contas;

public class Conta {

	protected double saldo;
	protected String cliente;
	
	protected Conta() {
		System.out.println("--------------------");
		System.out.println("Agencia: 0154");
	}
	
	protected void exibirSaldo() {
		System.out.println("Nome: "+ cliente);
		System.out.println("Saldo: "+ saldo);
	}
	
	
}
