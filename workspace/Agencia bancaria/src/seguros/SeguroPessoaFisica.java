package seguros;
import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		
		SeguroPessoaFisica  cc3 = new SeguroPessoaFisica();
		cc3.cliente = "Junior DaSilva";
		cc3.saldo = 8500.00;
		cc3.exibirSaldo();
		
	}

}
