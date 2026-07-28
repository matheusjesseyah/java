package poo;

public class Bloco {

	// attributos
	int resistencia;
	String textura;

	// construtor (código executado iniciado junto com o objeto)
	public Bloco() {
		System.out.println("=================");
	}

	// métodos
	void construir() {
		System.out.println("Bloco colocado");
	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}

	void craftar() {
		System.out.println("Item criado");
	}
	
}
