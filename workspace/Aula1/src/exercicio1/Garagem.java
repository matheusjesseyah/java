package exercicio1;

public class Garagem {

	public static void main(String[] args) {
		// objeto 1 - Ferrari
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "vermelho";

		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.acelerar();
		ferrari.desligar();

		// objeto 2 - Fusca
		Carro fusca = new Carro();
		fusca.ano = 1967;
		fusca.cor = "azul";

		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
	}

}
