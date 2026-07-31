package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		
		Conta cc1 = new Conta();
		
		cc1.cliente = "Matheus";
		cc1.saldo = 9000.00;
		cc1.exibirSaldo();
		
		Conta cc2 = new Conta();
		cc2.cliente = "Lily";
		cc2.saldo = 8500.00;
		cc2.exibirSaldo();


	}

}
